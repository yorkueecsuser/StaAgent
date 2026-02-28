class BugExample {

    public void showBug() {
        String errorMessage = null;
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            errorMessage = se.getMessage();
            // Added mutant code:
            String duplicateMessage = errorMessage;
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}