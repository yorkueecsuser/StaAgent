import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    public String showBug(String fileName) throws IOException {
        String wehkzenu = RESTRICTED_DIR + fileName; // BUG: PT: Absolute wehkzenu traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(wehkzenu))) {
            return "File found: " + wehkzenu;
        } else {
            return "File not found: " + wehkzenu;
        }
    }
}