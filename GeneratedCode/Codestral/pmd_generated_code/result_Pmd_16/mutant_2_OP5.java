class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();

            // Mutant: Unreachable switch statement
            int value = getValue(); // Assume getValue() is a method that returns a value
            switch (value) {
                case 0: // This case will never be reached as the value is not 0
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    private int getValue() {
        return 1; // Modify this method to return a value other than 0 to avoid the unreachable case in the switch statement
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}