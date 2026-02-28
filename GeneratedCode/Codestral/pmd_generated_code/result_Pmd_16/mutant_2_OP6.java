class BugExample {

    public void showBug() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This for loop is unreachable
        }
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();
        }
    }

    private boolean getCondition() {
        return false;
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}