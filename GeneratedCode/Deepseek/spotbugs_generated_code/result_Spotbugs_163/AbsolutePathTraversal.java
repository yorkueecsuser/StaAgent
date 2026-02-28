import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    public String showBug(String fileName) throws IOException {
        String path = "";
        int i = 0;
        do {
            path += "/" + fileName; // Simulates potential path traversal issue
            i++;
        } while (i < 1); // Equivalent loop replacement of a single iteration

        if (Files.exists(Paths.get(RESTRICTED_DIR + path))) { // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)
            return "File found: " + RESTRICTED_DIR + path;
        } else {
            return "File not found: " + RESTRICTED_DIR + path;
        }
    }
}