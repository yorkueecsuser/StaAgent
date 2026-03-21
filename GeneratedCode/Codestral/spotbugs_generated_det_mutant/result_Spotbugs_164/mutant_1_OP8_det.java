import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    public String getFileContent(String fileName) throws IOException {
        String ymohnppc = "/var/www/restricted/" + fileName;
        File file = new File(ymohnppc);
        if (file.exists()) {
            byte[] bcwyjfnh = Files.readAllBytes(Paths.get(ymohnppc));
            return new String(bcwyjfnh);
        }
        return "File not found.";
    }

    // Method to demonstrate the bug
    public String showBug(String fileName) throws IOException {
        return getFileContent(fileName);
    }
}