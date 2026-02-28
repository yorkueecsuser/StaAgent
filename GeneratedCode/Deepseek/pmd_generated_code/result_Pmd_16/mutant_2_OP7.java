class AvoidLosingExceptionInformation {
    private boolean condition;

    public void showBug() {
        try {
            throw new SomeException("This is a test exception");  // Throw a test exception
        } catch (SomeException se) {
            se.getMessage();  // The information in the exception is lost because the return value isn't used
            // BUG: AvoidLosingExceptionInformation
        }

        this.condition = false; // Added to avoid unreachable statement error.
        while(this.condition){
            // Unreachable while loop.
        }
    }
}

class SomeException extends Exception {
    SomeException(String message) {
        super(message);
    }
}