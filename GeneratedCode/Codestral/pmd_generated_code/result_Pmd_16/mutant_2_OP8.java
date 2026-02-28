class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();
            // Mutant code added based on the renaming mutation operator
            SomeException a = se;
            a.printStackTrace(); // For example, using the renamed variable to print stack trace
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}