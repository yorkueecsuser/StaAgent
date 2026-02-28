import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

class TreeToStringBug {
    static String buggyCode =
            "class BuggyClass {\n" +
            "    void buggyMethod() {\n" +
            "        String deadStore = generateRandomString(8); // Added dead store\n" +
            "        System.out.println(this.toString()); // BUG: TreeToString\n" +
            "    }\n" +
            "}\n" +
            "class Main {\n" +
            "    static String generateRandomString(int length) {\n" +
            "        String chars = \"abcdefghijklmnopqrstuvwxyz\";\n" +
            "        StringBuilder sb = new StringBuilder();\n" +
            "        Random random = new Random();\n" +
            "        for (int i = 0; i < length; i++) {\n" +
            "            int index = random.nextInt(chars.length());\n" +
            "            sb.append(chars.charAt(index));\n" +
            "        }\n" +
            "        return sb.toString();\n" +
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