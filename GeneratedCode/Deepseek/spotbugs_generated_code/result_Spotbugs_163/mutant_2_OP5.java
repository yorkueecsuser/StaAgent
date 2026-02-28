import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";
    private static boolean getFalseCondition() { return false; }

    public String showBug(String fileName) throws IOException {
        String path = RESTRICTED_DIR + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        if (Files.exists(Paths.get(path))) {
            switch (getFalseCondition()? 1 : 0) { // Unreachable switch statement mutation
                case 1:
                    System.out.println("This line should be unreachable");
                    break;
            }
            return "File found: " + path;
        } else {
            return "File not found: " + path;
        }
    }
}