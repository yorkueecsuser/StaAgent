import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    public String getFileContent(String d) throws IOException {
        String a = "/var/www/restricted/" + d;
        File b = new File(a);
        if (b.exists()) {
            byte[] c = Files.readAllBytes(Paths.get(a));
            return new String(c);
        }
        return "File not found.";
    }

    // Method to demonstrate the bug
    public String showBug(String e) throws IOException {
        return getFileContent(e);
    }
}