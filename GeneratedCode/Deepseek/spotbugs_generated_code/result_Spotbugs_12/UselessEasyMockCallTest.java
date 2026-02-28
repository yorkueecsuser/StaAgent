import org.junit.Test;
import static org.junit.Assert.*;

public class UselessEasyMockCallTest {
    @Test
    public void testShowBug() {
        UselessEasyMockCall obj = new UselessEasyMockCall();
        // TRIGGER BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        int result = obj.showBug();
        // As the expectation of EasyMock.expectLastCall() is not set in the test, it will throw an UnexpectedMethodCallException
        // to demonstrate that the bug exists. Since we don't catch this exception and don't add it to @Expected, the test will fail.
        fail("Test should have failed due to the bug");
    }
}