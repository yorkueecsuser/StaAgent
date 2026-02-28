class BugExample {

    public void showBug() {
        int deadStoreVariable; // This is the dead store variable
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}