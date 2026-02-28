import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    public String getFileContent(String fileName) throws IOException {
        String filePath = "/var/www/restricted/" + fileName;
        File file = new File(filePath);
        if (file.exists()) {
            // Mutated code: Unreachable while loop
            boolean conditionWhile = false;
            while (conditionWhile) {
                System.out.println("This line should be unreachable");
            }

            byte[] fileContent = Files.readAllBytes(Paths.get(filePath));
            return new String(fileContent);
        }
        return "File not found.";
    }

    public String showBug(String fileName) throws IOException {
        return getFileContent(fileName);
    }
}