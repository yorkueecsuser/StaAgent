import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class TreeToStringBug {
    static String buggyCode =
            "class BuggyClass {\n" +
            "    void buggyMethod() {\n" +
            "        System.out.println(this.toString());\n" +
            "        System.out.println(this.toString()); // Mutant: Duplication\n" +
            "    }\n" +
            "}";

    // rest of the code remains the same
}