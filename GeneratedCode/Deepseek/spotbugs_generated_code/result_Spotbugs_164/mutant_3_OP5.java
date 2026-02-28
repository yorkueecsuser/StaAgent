import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    public String getFileContent(String fileName) throws IOException {
        String filePath = "/var/www/restricted/" + fileName;
        File file = new File(filePath);

        // Mutant: Unreachable switch statement
        switch(getUnreachableValue()) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
        }

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

    // Method to return an unreachable value for the switch statement
    private int getUnreachableValue() {
        return -1; // This value is not used in the switch case
    }
}