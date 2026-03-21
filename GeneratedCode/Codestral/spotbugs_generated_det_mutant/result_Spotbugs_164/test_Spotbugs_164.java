import org.junit.Test;
import static org.junit.Assert.*;

public class RelativePathTraversalServletTest {

    @Test
    public void testRelativePathTraversal() throws Exception {
        RelativePathTraversalServlet servlet = new RelativePathTraversalServlet();
        // TRIGGER BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
        String content = servlet.showBug("../../../etc/passwd");
        assertNotEquals("File not found.", content); // Bug should make this fail as it allows access to an unintended file
    }
}