class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();

            // Mutant code: Unreachable if-else statement
            boolean shouldRun = false;
            if (shouldRun) {
                // This code is unreachable
                System.out.println("This is an unreachable if-else branch");
            } else {
                // Alternative code
                // Do nothing or add some alternative code here
            }
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}