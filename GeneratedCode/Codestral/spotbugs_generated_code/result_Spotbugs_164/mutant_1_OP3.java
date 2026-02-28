import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    // Mutated code with an unreachable if statement
    public String getFileContent(String fileName) throws IOException {
        String filePath = "/var/www/restricted/" + fileName;
        File file = new File(filePath);
        if (file.exists()) {
            if (shouldRunUnreachableCondition()) {
                // Unreachable code
                return "This code is unreachable.";
            }
            byte[] fileContent = Files.readAllBytes(Paths.get(filePath));
            return new String(fileContent);
        }
        return "File not found.";
    }

    // Dynamic method to return a constant false value
    private boolean shouldRunUnreachableCondition() {
        return false;
    }

    // Method to demonstrate the bug
    public String showBug(String fileName) throws IOException {
        return getFileContent(fileName);
    }
}