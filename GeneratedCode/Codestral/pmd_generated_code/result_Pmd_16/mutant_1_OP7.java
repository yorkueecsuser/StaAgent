class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // Unreachable code
                System.out.println("This is an unreachable while loop");
            }
            // AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}