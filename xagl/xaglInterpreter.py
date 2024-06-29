from antlr4 import *
from xaglLexer import xaglLexer
from xaglParser import xaglParser
from xaglVisitor import xaglVisitor

class xaglInterpreter(xaglVisitor):
    def __init__(self):
        super().__init__()
        self.unique_ids = set()  # Lista de IDs únicos

    # Visitando comandos
    def visitRefreshCommand(self, ctx:xaglParser.RefreshCommandContext):
        var_name = ctx.ID().getText()
        self.unique_ids.add(var_name)  # Adiciona o ID à lista de IDs únicos
        return self.visitChildren(ctx)

    def visitMoveCommand(self, ctx:xaglParser.MoveCommandContext):
        var_name = ctx.ID().getText()
        self.unique_ids.add(var_name)  # Adiciona o ID à lista de IDs únicos
        return self.visitChildren(ctx)

    def visitLoopStatement(self, ctx:xaglParser.LoopStatementContext):
        return self.visitChildren(ctx)  # Não precisamos fazer nada para o comando loopStatement

    def visitStateChange(self, ctx:xaglParser.StateChangeContext):
        var_name = ctx.ID(0).getText()
        self.unique_ids.add(var_name)  # Adiciona o ID à lista de IDs únicos
        return self.visitChildren(ctx)

    # Outros métodos de visitação conforme necessário

# Integrando com o visitor existente
class xaglAndAglInterpreter(xaglInterpreter):
    def __init__(self):
        super().__init__()

    # Adicionar métodos de visitação para comandos e expressões do 'agl' conforme necessário

# Exemplo de uso
def interpret_xagl(file_path):
    input_stream = FileStream(file_path)
    lexer = xaglLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = xaglParser(token_stream)
    tree = parser.program()

    xagl_interpreter = xaglAndAglInterpreter()
    xagl_interpreter.visit(tree)
    
    return xagl_interpreter.unique_ids

class xaglToPythonInterpreter(xaglInterpreter):
    def __init__(self, output_file, func_name):
        super().__init__()  # Apenas chama o construtor da classe pai sem argumentos
        self.output_file = output_file
        self.python_code = ""
        self.func_name = func_name

    def translate_xagl_to_python(self, file_path):
        input_stream = FileStream(file_path)
        lexer = xaglLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = xaglParser(token_stream)
        tree = parser.program()

        self.visit(tree)

    def write_python_code_to_file(self):
        refresh_view = "def refresh_view(canvas,delay):\n\tcanvas.update_idletasks()\n\tcanvas.update()\n\tcanvas.after(delay)\n\n"
        move_obj = """def move_obj(x, y, canvas, obj):\n\tif obj != canvas:\n\t\tcanvas.move(obj, x, y)\n\telse:\n\t\tscroll_region = canvas.cget("scrollregion")\n\t\tscroll_region_x1 = float(scroll_region.split(" ")[0])\n\t\tscroll_region_y1 = float(scroll_region.split(" ")[1])\n\t\tscroll_region_x2 = float(scroll_region.split(" ")[2])\n\t\tscroll_region_y2 = float(scroll_region.split(" ")[3])\n\t\tcanvas.configure(scrollregion=(scroll_region_x1 + x, scroll_region_y1 + y, scroll_region_x2 + x, scroll_region_y2 + y))\n\t\t"""
        with open(self.output_file, 'w') as file:
            file.write("# "+ str(list(self.unique_ids)).replace("[", "").replace("]","").replace(",","").replace("'", "")+"\n")
            file.write("import tkinter as tk\n")
            file.write("import math\n\n")
            file.write(refresh_view)
            file.write(move_obj + "\n\n") 
            
            file.write("def " + self.func_name + "(")
            for index, item in enumerate(self.unique_ids):
                if index == len(self.unique_ids) - 1:
                    file.write(item + "):\n")
                else:
                    file.write(item + ", ")
            file.write(self.python_code)
            
            # Adiciona a lista de IDs únicos ao final do arquivo Python
            # file.write("\n\n# Lista de IDs únicos\n")
            # file.write("unique_ids = ")
            # file.write(str(list(self.unique_ids)))

    # Sobrescreva os métodos de visitação para gerar código Python
    def visitMoveCommand(self, ctx:xaglParser.MoveCommandContext):
        var_name = ctx.ID().getText()
        self.unique_ids.add(var_name)  # Adiciona o ID à lista de IDs únicos
        # self.python_code += f"\t{var_name}.move({ctx.vector().expression(0).getText()}, {ctx.vector().expression(1).getText()})\n"
        #def move_obj(x, y, canvas, obj):
        self.python_code += f"\tmove_obj({ctx.vector().expression(0).getText()}, {ctx.vector().expression(1).getText()} , v, {var_name})\n"

    def visitRefreshCommand(self, ctx:xaglParser.RefreshCommandContext):
        var_name = ctx.ID().getText()
        self.unique_ids.add(var_name)  # Adiciona o ID à lista de IDs únicos
        # self.python_code += f"\t{var_name}.refresh({ctx.INTEGER().getText()})\n"
        self.python_code += f"\trefresh_view({var_name}, {ctx.INTEGER().getText()})\n"

    # Implemente outros métodos de visitação conforme necessário

# Exemplo de uso
def generate_python_file(file_path, output_file):
    interpreter = xaglToPythonInterpreter(output_file)
    interpreter.translate_xagl_to_python(file_path)
    interpreter.write_python_code_to_file()

