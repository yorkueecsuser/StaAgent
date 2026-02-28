import org.junit.Test;
import static org.junit.Assert.*;

public class PathTraversalServletTest {

    @Test
    public void testShowBugWithPathTraversal() {
        PathTraversalServlet servlet = new PathTraversalServlet();
        MockHttpServletRequest request = new MockHttpServletRequest() {
            @Override
            public String getParameter(String name) {
                return "../outside.txt"; // TRIGGER BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
            }
        };

        String expectedFilePath = "/var/www/uploads/../outside.txt";
        try {
            String actualFilePath = servlet.showBug(request);
            assertEquals(expectedFilePath, actualFilePath); // This assertion is expected to pass
        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    public void testDoGetWithPathTraversal() {
        PathTraversalServlet servlet = new PathTraversalServlet();
        MockHttpServletRequest request = new MockHttpServletRequest() {
            @Override
            public String getParameter(String name) {
                return "../outside.txt"; // TRIGGER BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
            }
        };
        MockHttpServletResponse response = new MockHttpServletResponse();

        try {
            servlet.doGet(request, response); // TRIGGER BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
            // We assume that the response would normally send an error if the file doesn't exist
            // or is inaccessible due to path traversal prevention, hence if the bug is there, it
            // should not send a 404.
        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }
}