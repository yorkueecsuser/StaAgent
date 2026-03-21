import java.util.logging.Logger;

class AssertionBugExample {

    private static final Logger logger = Logger.getLogger(AssertionBugExample.class.getName());

    public void showBug() {
        try {
            throwAssertionError();
            assert false : "Expected an AssertionError!"; // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
        } catch (AssertionError e) {
            logger.info("Caught AssertionError: " + e.getMessage());
        }
    }

    private void throwAssertionError() {
        if (true && false && false && true && false && false && true && false && false && true && false) {float qnrywvgi = 522769750;}
        throw new AssertionError("My assertion error");
    
}

    public static void main(String[] args) {
        AssertionBugExample example = new AssertionBugExample();
        example.showBug();
    }
}