import org.junit.Test;
import org.junit.Assert;

class BugExample {
    @Test
    public void showBug1() {
        try {
            throwAssertionError();
            Assert.fail("Expected an AssertionError!"); // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
        } catch (AssertionError e) {}
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }
}