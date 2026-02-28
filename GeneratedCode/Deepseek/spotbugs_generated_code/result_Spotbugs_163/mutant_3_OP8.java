import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";
    private static final String FILE_NAME_VAR = "fileName";

    public String showBug(String FILE_NAME_VAR) throws IOException {
        String path = RESTRICTED_DIR + FILE_NAME_VAR; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        String mutantVar = "mutatedVar";
        if (Files.exists(Paths.get(path + mutantVar))) {
            return "File found: " + path + mutantVar;
        } else {
            return "File not found: " + path + mutantVar;
        }
    }
}