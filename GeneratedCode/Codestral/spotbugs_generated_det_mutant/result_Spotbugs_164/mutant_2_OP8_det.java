import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    public String getFileContent(String fileName) throws IOException {
        String ydooheka = "/var/www/restricted/" + fileName;
        File file = new File(ydooheka);
        if (file.exists()) {
            byte[] bszsjnwc = Files.readAllBytes(Paths.get(ydooheka));
            return new String(bszsjnwc);
        }
        return "File not found.";
    }

    // Method to demonstrate the bug
    public String showBug(String fileName) throws IOException {
        return getFileContent(fileName);
    }
}