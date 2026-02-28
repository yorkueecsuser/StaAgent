import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class TreeToStringBug {
    static String buggyCode =
            "class BuggyClass {\n" +
            "    String buggyField = \"Original Value\";\n" +   // Added for demonstration
            "    void buggyMethod() {\n" +
            "        System.out.println(this.toString()); // BUG: TreeToString\n" +
            "        buggyField = \"New Value\"; // Mutated line\n" +
            "        buggyField = \"Duplicated New Value\"; // Mutation: Duplicated assignment\n" +
            "    }\n" +
            "}";

    //... rest of the code remains the same...
}