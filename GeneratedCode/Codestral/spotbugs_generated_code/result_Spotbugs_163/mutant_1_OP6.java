import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    public String showBug(String fileName) throws IOException {
        // Unreachable for loop mutant
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line should never be printed");
        }

        String path = RESTRICTED_DIR + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(path))) {
            return "File found: " + path;
        } else {
            return "File not found: " + path;
        }
    }

    private boolean getCondition() {
        return false;
    }
}