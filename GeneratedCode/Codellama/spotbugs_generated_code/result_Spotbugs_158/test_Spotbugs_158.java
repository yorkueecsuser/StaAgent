import org.junit.Test;
import static org.junit.Assert.*;

public class ErrorServletTest {
    @Test
    public void testDoGet() throws Exception {
        ErrorServlet servlet = new ErrorServlet();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        // Set up the request to trigger the bug
        when(request.getParameter("errorMessage")).thenReturn("<script>alert('XSS')</script>");

        // Call the method under test
        servlet.doGet(request, response);

        // Verify that the error message was sent to the response
        verify(response).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "<script>alert('XSS')</script>");
    }
}