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
 * This mutated code is generated due to the mutation operator 'Renaming'. 
 * The variable'se' in the catch block has been renamed to 'a'.
 */
class AvoidLosingExceptionInformationMutant {

    /**
     * This method demonstrates the bug.
     * It catches a SomeException and invokes the getMessage() method on it, but doesn't use the result.
     * This is the mutated version of the original method'showBug()'.
     */
    public void showBug() {
        try {
            throw new SomeException("This is a test exception");  // Throw a test exception
        } catch (SomeException a) {
            a.getMessage();  // The information in the exception is lost because the return value isn't used
            // Mutant: AvoidLosingExceptionInformationMutant
        }
    }
}