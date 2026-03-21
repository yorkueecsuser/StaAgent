import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";
    private static final boolean UNREACHABLE_CONDITION = false;

    public String showBug(String fileName) throws IOException {
        String path = RESTRICTED_DIR + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(path))) {
            // Insert unreachable switch statement
            switch (UNREACHABLE_CONDITION) {
                case true:
                    System.out.println("This code will never be executed.");
                    break;
                default:
                    break;
            }
            return "File found: " + path;
        } else {
            return "File not found: " + path;
        }
    }
}