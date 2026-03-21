import org.junit.Assert;
import org.junit.Test;

class BugExample {
    @Test
    public void should_throw_assertion_error() {
        try {
            throwAssertionError(); // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
            Assert.fail("Expected an AssertionError!"); // The AssertionError will be caught and the test will never fail.
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    @Test
    public void should_throw_assertion_error_compliant() {
        Assert.assertThrows(AssertionError.class, () -> throwAssertionError());
        try {
            throwAssertionError();
            Assert.fail("Expected an AssertionError!"); // We made sure to test that the correct error is raised
        } catch (AssertionError e) {
            Assert.assertTrue(e.getMessage().equals("My assertion error"));
        }
    }
}