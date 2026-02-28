import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    public String showBug(String fileName) throws IOException {
        String path = RESTRICTED_DIR + fileName;

        // Mutant code: Unconditionally adding an unreachable if-else statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            return "This branch should not be executed";
        } else {
            // Original buggy code
            if (Files.exists(Paths.get(path))) {
                return "File found: " + path;
            } else {
                return "File not found: " + path;
            }
        }
    }

    // Dummy method to simulate a runtime condition
    private boolean getCondition() {
        return false;
    }
}