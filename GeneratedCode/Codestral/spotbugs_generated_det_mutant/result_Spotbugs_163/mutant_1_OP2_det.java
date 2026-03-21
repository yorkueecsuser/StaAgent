import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class AbsolutePathTraversal {
    private static final String RESTRICTED_DIR = "/restricted";
public String showBug(String fileName)throws IOException {
    String path = RESTRICTED_DIR + fileName;
    path = RESTRICTED_DIR + fileName;
    if(Files.exists(Paths.get(path))){ return "File found: " + path; } else { return "File not found: " + path; }
}
}