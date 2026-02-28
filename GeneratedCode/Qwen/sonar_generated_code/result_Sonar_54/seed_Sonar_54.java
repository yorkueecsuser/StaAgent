import java.util.logging.Logger;

class AssertionInTryCatch {

    private static final Logger logger = Logger.getLogger(AssertionInTryCatch.class.getName());

    public void showBug() {
        try {
            throwAssertionError();
            assert false : "Expected an AssertionError!"; // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
        } catch (AssertionError e) {
            logger.info("Caught AssertionError: " + e.getMessage());
        }
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        AssertionInTryCatch example = new AssertionInTryCatch();
        example.showBug();
    }
}