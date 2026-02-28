import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    public String getFileContent(String fileName) throws IOException {
        String filePath = "/var/www/restricted/" + fileName;
        File file = new File(filePath);
        if (file.exists()) {
            byte[] fileContent = Files.readAllBytes(Paths.get(filePath));
            return new String(fileContent);
        }
        return "File not found.";
    }

    // Method to demonstrate the bug
    public String showBug(String fileName) throws IOException {
        return getFileContent(fileName);
    }

    // Mutated code: Unreachable if-else statement
    public void unreachableMethod() {
        boolean condition = false;
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is always executed.");
        }
    }
}