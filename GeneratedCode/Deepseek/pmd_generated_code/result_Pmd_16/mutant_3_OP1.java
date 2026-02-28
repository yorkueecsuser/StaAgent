/**
 * This Java class demonstrates a bug where exception information is lost in a catch block.
 */
class AvoidLosingExceptionInformation {

    /**
     * This method demonstrates the bug.
     * It catches a SomeException and invokes the getMessage() method on it, but doesn't use the result.
     */
    public void showBug() {
        try {
            throw new SomeException("This is a test exception");  // Throw a test exception
        } catch (SomeException se) {
            String myVar = se.getMessage();  // Dead store mutation: Inserting unused variable declaration.
            // BUG: AvoidLosingExceptionInformation
        }
    }
}

/**
 * A simple custom exception class for demonstration purposes.
 */
class SomeException extends Exception {
    SomeException(String message) {
        super(message);
    }
}