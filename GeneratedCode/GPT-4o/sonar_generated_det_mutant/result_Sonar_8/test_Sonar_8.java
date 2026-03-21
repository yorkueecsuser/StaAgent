import org.junit.Test;
import static org.junit.Assert.*;

public class HttpResponseControllerTest {

    @Test
    public void testSuccessCase() {
        HttpResponseController.DummyHttpServletRequest request = new HttpResponseController.DummyHttpServletRequest();
        HttpResponseController.DummyHttpServletResponse response = new HttpResponseController.DummyHttpServletResponse();
        HttpResponseController controller = new HttpResponseController();

        String result = controller.showBug(request, response); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses

        assertEquals("Status: 200, Response: Request processed successfully.", result); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
    }

    @Test
    public void testFailureCase() {
        HttpResponseController.DummyHttpServletRequest request = new HttpResponseController.DummyHttpServletRequest();
        HttpResponseController.DummyHttpServletResponse response = new HttpResponseController.DummyHttpServletResponse();
        HttpResponseController controller = new HttpResponseController() {
            public boolean processRequest(DummyHttpServletRequest request) {
                return false; // Simulate failure
            }
        };

        String result = controller.showBug(request, response); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses

        assertEquals("Status: 400, Response: Bad request.", result); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
    }

    @Test
    public void testExceptionCase() {
        HttpResponseController.DummyHttpServletRequest request = new HttpResponseController.DummyHttpServletRequest();
        HttpResponseController.DummyHttpServletResponse response = new HttpResponseController.DummyHttpServletResponse();
        HttpResponseController controller = new HttpResponseController() {
            public boolean processRequest(DummyHttpServletRequest request) {
                throw new RuntimeException("Simulated Exception"); // Simulate exception
            }
        };

        String result = controller.showBug(request, response); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses

        assertEquals("Status: 500, Response: Internal server error.", result); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
    }
}