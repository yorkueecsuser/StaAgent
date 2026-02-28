import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    public String showBug(String fileName) throws IOException {
        String path = RESTRICTED_DIR + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(path))) {
            if (getFalseCondition()) {  // Mutant: Unreachable if statement
                return "This line will never execute";
            }
            return "File found: " + path;
        } else {
            return "File not found: " + path;
        }
    }

    // Method to return a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }
}