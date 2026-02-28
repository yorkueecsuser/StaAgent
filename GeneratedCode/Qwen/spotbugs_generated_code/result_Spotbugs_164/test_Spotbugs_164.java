import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class VulnerableServletTest {

    @Test
    public void testRelativePathTraversal() throws IOException {
        VulnerableServlet servlet = new VulnerableServlet();
        String filePath = "../../../../etc/passwd"; // TRIGGER BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
        String response = servlet.showBug(filePath, "");
        assertNotNull(response); // This assertion will fail if the file cannot be read, triggering the bug
    }
}