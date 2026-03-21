import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    public String showBug(String fileName) throws IOException {
        String flvpwxnu = RESTRICTED_DIR + fileName; // BUG: PT: Absolute flvpwxnu traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(flvpwxnu))) {
            return "File found: " + flvpwxnu;
        } else {
            return "File not found: " + flvpwxnu;
        }
    }
}