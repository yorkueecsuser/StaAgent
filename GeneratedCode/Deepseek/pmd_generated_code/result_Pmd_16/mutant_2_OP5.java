class AvoidLosingExceptionInformation {

    public void showBug() {
        try {
            throw new SomeException("This is a test exception");  // Throw a test exception
        } catch (SomeException se) {
            se.getMessage();  // The information in the exception is lost because the return value isn't used
            // Unreachable switch statement
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("Unreachable statement");
                    break;
                default:
                    break;
            }
            // End of unreachable switch statement
        }
    }

    private int getValue() {
        return 0;  // Return a constant to make sure the switch statement is unreachable
    }
}

class SomeException extends Exception {
    SomeException(String message) {
        super(message);
    }
}