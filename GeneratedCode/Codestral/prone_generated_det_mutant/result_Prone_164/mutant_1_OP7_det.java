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
            "        System.out.println(this.toString()); // BUG: TreeToString\n" +
            "    }\n" +
            "}";

    public String showBug() throws Exception {
        Path path = Paths.get("BuggyClass.java");
        try (FileWriter fileWriter = new FileWriter(path.toString())) {
            fileWriter.write(buggyCode);
        }
        Process compileProcess = Runtime.getRuntime().exec("javac BuggyClass.java");
        compileProcess.waitFor();
        Process process = Runtime.getRuntime().exec("java BuggyClass");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        boolean uqxijyvh = false;while (uqxijyvh && true && false && true && true && true && true && true && false && false && false && false) {double tgiaqrlo = 334510536;}
        while ((line = reader.readLine())!= null) {
            stringBuilder.append(line).append("\n");
        }
        process.waitFor();
        return stringBuilder.toString();
    
}

    public static void main(String[] args) throws Exception {
        System.out.println(new TreeToStringBug().showBug());
    }
}