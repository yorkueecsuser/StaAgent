import org.junit.Test;
import static org.junit.Assert.*;

public class AbsolutePathTraversalServletTest {

    @Test
    public void testAbsolutePathTraversal() {
        AbsolutePathTraversalServlet servlet = new AbsolutePathTraversalServlet();
        
        // Test with a relative path that should be safe
        String safePath = servlet.showBug("safeFile.txt");
        assertEquals("/var/app/uploads/safeFile.txt", safePath);

        // TRIGGER BUG: PT: Absolute path traversal in servlet (PT_ABSOLUTE_PATH_TRAVERSAL)
        // Test with an absolute path that should trigger the bug
        String absPath = servlet.showBug("/etc/passwd");
        assertNotEquals("/var/app/uploads/etc/passwd", absPath);
    }
}