import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.IOException; // Added import statement

public class HttpResponseSplitVulnerabilityTest {

    @Test
    public void testShowBug() {
        HttpResponseSplitVulnerability bug = new HttpResponseSplitVulnerability();
        StringWriter writer = new StringWriter();
        String userInput = "\r\nAnother-Header: bad-value";

        try {
            bug.showBug(userInput, new PrintWriter(writer));
            // TRIGGER BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
            // The bug is triggered when userInput contains a newline character and a valid HTTP header field.
            // This can lead to unexpected behavior and potential security vulnerabilities.
            fail("Expected IOException due to HTTP response splitting vulnerability");
        } catch (IOException e) {
            // IOException is expected and handled here
        }
    }
}