class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();
            // Mutant: Unreachable if statement
            if (getUnreachableCondition()) {
                // This code is unreachable
                System.out.println("This code is unreachable");
            }
        }
    }

    // New method to return an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}