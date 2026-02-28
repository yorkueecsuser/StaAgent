import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class TreeToStringBug {
    static String buggyCode =
            "class MutatedClass {\n" +
            "    void buggyMethod() {\n" +
            "        System.out.println(this.toString()); // BUG: TreeToString\n" +
            "    }\n" +
            "}";

    public String showBug() throws Exception {
        Path path = Paths.get("MutatedClass.java");
        try (FileWriter fileWriter = new FileWriter(path.toString())) {
            fileWriter.write(buggyCode);
        }
        Process compileProcess = Runtime.getRuntime().exec("javac MutatedClass.java");
        compileProcess.waitFor();
        Process process = Runtime.getRuntime().exec("java MutatedClass");
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