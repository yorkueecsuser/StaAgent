class AvoidLosingExceptionInformation {

    /**
     * This method demonstrates the bug.
     * It catches a SomeException and invokes the getMessage() method on it, but doesn't use the result.
     */
    public void showBug() {
        try {
            throw new SomeException("This is a test exception");  // Throw a test exception
        } catch (SomeException se) {
            se.getMessage();  // The information in the exception is lost because the return value isn't used
            // BUG: AvoidLosingExceptionInformation
            if(false) { // Unreachable code here
                System.out.println("This code is unreachable due to the above mutation.");
            }
        }
    }
}

/**
 * A simple custom exception class for demonstration purposes.
 */
class SomeException extends Exception {
    SomeException(String message) {
        super(message);
        if(false) { // Unreachable code here
            System.out.println("This code is unreachable due to the above mutation.");
        }
    }
}