import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    public String showBug(String fileName) throws IOException {
        String path = RESTRICTED_DIR + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(path))) {
            return "File found: " + path;
        } else {
            switch (getFalseValue()) { // Unreachable switch statement
                case 1:
                    System.out.println("This line is unreachable");
                    break;
                default:
                    System.out.println("This line is also unreachable");
            }
            return "File not found: " + path;
        }
    }

    private int getFalseValue() {
        return -1; // Always returns a value that doesn't match any case in the switch statement
    }
}