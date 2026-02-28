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
            if (getCondition()) {
                se.getMessage();  // The information in the exception is lost because the return value isn't used
                // Mutant: AvoidLosingExceptionInformation
            }
        }
    }

    /**
     * Helper method to get a condition value.
     * This method is used in the mutant to dynamically set the condition.
     * @return boolean value indicating the condition
     */
    private boolean getCondition() {
        return true;
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