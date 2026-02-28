class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // Mutation: AvoidLosingExceptionInformation, not using the information from the exception
            // Original bug: se.getMessage();
            // Mutated code:
            // Removed the line "se.getMessage();" to lose the exception information
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}