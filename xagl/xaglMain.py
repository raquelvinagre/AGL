from antlr4 import *
from xaglInterpreter import xaglToPythonInterpreter  # Importe o interpretador xagl para Python
import argparse


def main(file, scriptname):
    try:
        # Caminho do arquivo xagl
        file_path = "../examples/" + file  # Atualize o caminho para o seu arquivo xagl

        output_file = scriptname + ".py"


        # Crie uma instância do interpretador xaglToPythonInterpreter
        interpreter = xaglToPythonInterpreter(output_file, scriptname )

        # Interprete o arquivo xagl
        interpreter.translate_xagl_to_python(file_path)

        # Gere o arquivo Python traduzido a partir do arquivo xagl
        interpreter.write_python_code_to_file()

        print("Código Python gerado com sucesso")

    except Exception as e:
        print(f"Erro durante a execução: {e}")

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Processar arquivos xagl.')
    parser.add_argument('file', type=str, help='Nome do arquivo xagl a ser processado')
    parser.add_argument('scriptname', type=str, help='Nome do arquivo xagl a ser processado')
    args = parser.parse_args()

    main(args.file, args.scriptname)