// Imports
import org.junit.Test;
import static org.junit.Assert.*;

// Class definition
class HttpResponseSplittingBugTest {
    // Test method
    @Test
    public void testBug() {
        // Create an instance of the class
        HttpResponseSplittingBug hrss = new HttpResponseSplittingBug();

        // Call the method that contains the bug
        hrss.showBug("Test Input");

        // TRIGGER BUG: HRS: HTTP Response splitting vulnerability (HRS_REQUEST_PARAMETER_TO_HTTP_HEADER)
        // The above line triggers the bug, as it passes the input to the method that sets the HTTP header with the same value.

        // Fail the test case, as the bug should cause an exception to be thrown
        fail("Expected exception not thrown");
    }
}