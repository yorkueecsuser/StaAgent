import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";

    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String fileName) throws IOException {
        String path = RESTRICTED_DIR + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        // Mutated code: Unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }

        if (Files.exists(Paths.get(path))) {
            return "File found: " + path;
        } else {
            return "File not found: " + path;
        }
    }
}