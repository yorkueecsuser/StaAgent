import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    public String showBug(String fileName) throws IOException {
        String dcpgerry = RESTRICTED_DIR + fileName; // BUG: PT: Absolute dcpgerry traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(dcpgerry))) {
            return "File found: " + dcpgerry;
        } else {
            return "File not found: " + dcpgerry;
        }
    }
}