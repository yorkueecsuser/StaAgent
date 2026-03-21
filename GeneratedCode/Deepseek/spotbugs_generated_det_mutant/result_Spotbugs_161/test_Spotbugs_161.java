import org.junit.Test;
import static org.junit.Assert.*;

public class HRSVulnerabilityExampleTest {
    @Test
    public void testShowBug() {
        HRSVulnerabilityExample obj = new HRSVulnerabilityExample();
        // TRIGGER BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        String userInput = "User-Agent: Mozilla Firefox \n X-User-Input: Hello";
        String result = obj.showBug(userInput);
        String expected = "X-User-Input: User-Agent: Mozilla Firefox \n Hello";
        assertEquals(expected, result); // This test case should fail
    }
}