import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyControllerTest {

    @Test
    public void testHandleRequestException() {
        HttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();

        BuggyController controller = new BuggyController();

        // Expecting exception as per the bug
        try {
            controller.showBug(request, response);
            fail("Expected an exception to be thrown"); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
        } catch (Exception e) {
            // Expected exception to be thrown
        }

        // No appropriate status code is set on exception, so the response status should not be SC_OK
        assertNotEquals(HttpServletResponse.SC_OK, response.getStatus());
    }

    // Mock classes to simulate HttpServletRequest and HttpServletResponse
    private static class MockHttpServletRequest extends HttpServletRequest {}

    private static class MockHttpServletResponse extends HttpServletResponse {
        private int status;

        @Override
        public void setStatus(int sc) {
            this.status = sc;
        }

        public int getStatus() {
            return this.status;
        }
    }
}