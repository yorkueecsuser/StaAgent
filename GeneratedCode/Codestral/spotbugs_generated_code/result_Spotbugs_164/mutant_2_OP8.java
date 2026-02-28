import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class RelativePathTraversalServlet {
    // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    public String getFileContent(String a) throws IOException {
        String b = "/var/www/restricted/" + a;
        File c = new File(b);
        if (c.exists()) {
            byte[] d = Files.readAllBytes(Paths.get(b));
            return new String(d);
        }
        return "File not found.";
    }

    // Method to demonstrate the bug
    public String showBug(String e) throws IOException {
        return getFileContent(e);
    }
}