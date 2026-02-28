class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();
            while (getCondition()) { // Mutated code
                // This block is unreachable because getCondition() always returns false
            }
        }
    }

    private static boolean getCondition() {
        return false;
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}