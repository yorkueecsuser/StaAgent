import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class StatusCodeBugExampleTest {

    @Test
    public void testShowBugWithSuccess() throws IOException {
        StatusCodeBugExample example = new StatusCodeBugExample();
        String result = example.showBug(); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
        assertFalse(result.contains("Status Code: 200")); // This assertion will fail because the status code is incorrectly set to 200
    }

    @Test
    public void testShowBugWithFailure() throws IOException {
        StatusCodeBugExample example = new StatusCodeBugExample() {
            @Override
            public String showBug() throws IOException {
                StringBuilder responseMessage = new StringBuilder();
                try {
                    boolean operationSuccess = false; // Force operation failure
                    if (operationSuccess) {
                        responseMessage.append("Operation succeeded");
                        responseMessage.append(" Status Code: ").append(200);
                    } else {
                        responseMessage.append("Operation failed");
                        responseMessage.append(" Status Code: ").append(200); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
                    }
                } catch (Exception e) {
                    responseMessage.append("An error occurred: ").append(e.getMessage());
                    responseMessage.append(" Status Code: ").append(200);
                }
                return responseMessage.toString();
            }
        };
        String result = example.showBug();
        assertFalse(result.contains("Status Code: 200")); // This assertion will fail because the status code is incorrectly set to 200
    }

    @Test
    public void testShowBugWithException() throws IOException {
        StatusCodeBugExample example = new StatusCodeBugExample() {
            @Override
            public String showBug() throws IOException {
                StringBuilder responseMessage = new StringBuilder();
                try {
                    throw new IOException("Simulated Exception"); // Force an exception
                } catch (Exception e) {
                    responseMessage.append("An error occurred: ").append(e.getMessage());
                    responseMessage.append(" Status Code: ").append(200); // TRIGGER BUG: Set appropriate Status Codes on HTTP responses
                }
                return responseMessage.toString();
            }
        };
        String result = example.showBug();
        assertFalse(result.contains("Status Code: 200")); // This assertion will fail because the status code is incorrectly set to 200
    }
}