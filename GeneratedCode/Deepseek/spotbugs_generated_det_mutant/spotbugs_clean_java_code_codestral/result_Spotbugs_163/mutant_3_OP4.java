import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";
    private static boolean getUnreachableCondition() {
        return false; // This condition will always be false, making this branch unreachable
    }

    public String showBug(String fileName) throws IOException {
        String path = RESTRICTED_DIR + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(path))) {
            return "File found: " + path;
        } else {
            if (getUnreachableCondition()) {
                // This code is unreachable and is added as per the mutation operator
                return "This code is unreachable";
            } else {
                return "File not found: " + path;
            }
        }
    }
}