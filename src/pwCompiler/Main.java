package pwCompiler;

/**
 * Created by zz5013 on 11/06/17.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import pwCompiler.pWhileParser;
import pwCompiler.pWhileListener;
import pwCompiler.pWhileLexer;
import pwCompiler.pWhileVisitor;
import pwCompiler.pWhileBaseListener;
import pwCompiler.pWhileBaseVisitor;

// This is a compiler which translates pWhile program
// into tensor representations in Python(tensorflow)
public class  Main {
    public static void main(String[] args) throws Exception {

        /*
        CharStream input = new ANTLRInputStream("var\n" +
                "  a : {-3..3};\n" +
                "  b : {1, 2};\n" +
                "begin\n" +
                "a ?= {-3..3};\n" +
                "b ?= {1, 2};\n" +
                "while (a == b) do\n" +
                "a := 1\n" +
                "od;\n" +
                "stop;\n" +
                "end");
*/


        String inputFilePath = null;
        File inFile = null;

        if (args.length > 0) {
            inputFilePath = args[0];
        }

     //   inputFilePath = "test.pw";
        InputStream is = System.in;
        if (inputFilePath != null) {
            inFile = new File(inputFilePath);
            is = new FileInputStream(inFile);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);



        pWhileLexer lexer = new pWhileLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);

        pWhileParser parser = new pWhileParser(tokens);

        ParseTree tree = parser.prog();

        //System.err.println(tree.toStringTree(parser));

        // draw concrete syntax tree
        //Trees.inspect(tree, parser);


        /*
        ParseTreeWalker walker = new ParseTreeWalker();
        pWhileListener listener = new PrintVisitPath();
        walker.walk(listener, tree);
        */

        //code generation

        String inputFileName = inFile == null ? "out.py" : inFile.getName();
        String outputFileName = inputFileName.substring(0,
                inputFileName.lastIndexOf('.')) + ".py";

        PrintWriter pw = new PrintWriter(outputFileName);


        CodeGeneratorVisitor generator = new CodeGeneratorVisitor(pw);
        generator.visit(tree);
        pw.close();

    }
}
