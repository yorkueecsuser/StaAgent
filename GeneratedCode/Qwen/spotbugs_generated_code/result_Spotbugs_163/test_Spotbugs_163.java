import org.junit.Test;
import static org.junit.Assert.*;

public class PathTraversalServletTest {

    @Test
    public void testAbsoluteFilePath() {
        PathTraversalServlet servlet = new PathTraversalServlet();
        String result = servlet.showBug("/etc/passwd"); // TRIGGER BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        assertEquals("/etc/passwd", result);
    }

    @Test
    public void testRootDirectory() {
        PathTraversalServlet servlet = new PathTraversalServlet();
        String result = servlet.showBug("/"); // TRIGGER BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL) ⁠
        assertEquals("/", result);
    }
}