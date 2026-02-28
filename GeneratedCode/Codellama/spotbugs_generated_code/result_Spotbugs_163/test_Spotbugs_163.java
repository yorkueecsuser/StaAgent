import static org.junit.Assert.*;
import org.junit.Test;

public class AbsolutePathTraversalServletTest {
    @Test
    public void testAbsolutePathTraversal() throws IOException {
        AbsolutePathTraversalServlet servlet = new AbsolutePathTraversalServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        // Set up the request to contain an absolute path traversal
        when(request.getParameter("path")).thenReturn("/etc/passwd");

        // Trigger the bug
        servlet.doGet(request, response);

        // Verify that the response status is 404
        assertEquals(HttpServletResponse.SC_NOT_FOUND, response.getStatus());
    }
}