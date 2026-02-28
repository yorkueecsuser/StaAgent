import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class TreeToStringBug {
    static String buggyCode =
            "class BuggyClass {\n" +
            "    void buggyMethod() {\n" +
            "        System.out.println(this.toString()); // BUG: TreeToString\n" +
            "        int value = getFalseValue(); // Added for unreachable switch statement\n" +
            "        switch (value) { // Unreachable switch statement\n" +
            "            case 1:\n" +
            "                System.out.println(\"Unreachable code\");\n" +
            "                break;\n" +
            "        }\n" +
            "    }\n" +
            "    private int getFalseValue() { // Method to return false value\n" +
            "        return 0;\n" +
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