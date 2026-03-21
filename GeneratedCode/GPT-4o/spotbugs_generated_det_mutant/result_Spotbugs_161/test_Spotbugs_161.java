import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public class HttpResponseSplittingExampleTest {

    @Test
    public void testShowBugWithVulnerableInput() {
        HttpResponseSplittingExample example = new HttpResponseSplittingExample();
        MockHttpServletResponse response = new MockHttpServletResponse();
        
        // Test input that could lead to HTTP response splitting
        String maliciousInput = "maliciousInput\r\nSet-Cookie: sessionToken=abc123"; // TRIGGER BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        
        try {
            // The bug is triggered here by directly passing potentially harmful input
            example.showBug(response, maliciousInput); // TRIGGER BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
            
            // The test is expected to fail as this input could cause a response splitting vulnerability
            fail("The test should trigger an HTTP response splitting vulnerability and fail.");
        } catch (IOException e) {
            // Handle exception if needed
        }
    }
}