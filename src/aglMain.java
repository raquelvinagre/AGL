import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class aglMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
         // create a lexer that feeds off of input CharStream:
         aglLexer lexer = new aglLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         aglParser parser = new aglParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
         }

         // // // Create a visitor
         // SemanticAnaliser semanticAnaliser = new SemanticAnaliser();
         // // Visit the tree
         // semanticAnaliser.visit(tree);

         // Compilador visitor = new Compilador();
         
         // // Visit the tree
         // String pythonCode = visitor.visit(tree);
         // // Print the generated Python code
         // String outputFile = "output.py";
         // Files.write(Paths.get(outputFile), pythonCode.getBytes());
         // System.out.println("Python code generated successfully");



         // Create a visitor
         AGLToPythonCompiler visitor = new AGLToPythonCompiler();
         // Visit the tree
         String pythonCode = visitor.visit(tree);
         // Print the generated Python code
         String outputFile = "output.py";
         Files.write(Paths.get(outputFile), pythonCode.getBytes());
         System.out.println("Python code generated successfully");
         
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
