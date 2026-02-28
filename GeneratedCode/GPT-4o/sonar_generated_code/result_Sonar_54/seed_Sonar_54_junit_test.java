import org.junit.Assert;

class AssertionErrorExample {

    public void showBug() {
        try {
            throwAssertionError();
            Assert.fail("Expected an AssertionError!"); // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
        } catch (AssertionError e) {
            // Catching the AssertionError but not testing any properties of the exception
        }
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        AssertionErrorExample example = new AssertionErrorExample();
        example.showBug();
    }
}