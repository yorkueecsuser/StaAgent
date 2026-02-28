class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // AvoidLosingExceptionInformation, the information from the exception is not used
            if (isConditionFalse()) {
                // This branch is unreachable
                System.out.println("Unreachable branch");
            }
            se.getMessage();
        }
    }

    private boolean isConditionFalse() {
        return false;
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}