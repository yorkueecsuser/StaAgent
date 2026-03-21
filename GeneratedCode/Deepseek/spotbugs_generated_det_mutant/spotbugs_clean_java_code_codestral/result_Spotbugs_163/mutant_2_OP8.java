import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";
    private static final String FILE_PATH = "filePath";

    public String showBug(String fileName) throws IOException {
        String path = RESTRICTED_DIR + fileName; // BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)

        String r = "fileRepresentation"; // Mutant: Renamed variable

        if (Files.exists(Paths.get(path))) {
            r = "File found: " + path;
        } else {
            r = "File not found: " + path;
        }

        return r;
    }
}