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
            se.getMessage();  // The information in the exception is lost because the return value isn't used
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

/**
 * This class creates a new SomeException with a different name and does not utilise the exception
 */
class RenamingMutant {
    public void showBug() {
        try {
            throw new SomeExceptionRenamed("This is a test exception");  // Throw a test exception with a new name
        } catch (SomeExceptionRenamed se) {
            se.getMessage();  // The information in the exception is lost because the return value isn't used
            // BUG: AvoidLosingExceptionInformation with a renamed Exception
        }
    }
}

/**
 * A simple custom exception class for demonstration purposes.
 */
class SomeExceptionRenamed extends Exception {
    SomeExceptionRenamed(String message) {
        super(message);
    }
}