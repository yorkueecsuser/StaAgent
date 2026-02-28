class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // Original code
            se.getMessage();

            // Mutated code by Unreachable for loop
            boolean condition = getCondition();
            for (int i = 0; condition; i++) {
                // This loop is unreachable as getCondition() always returns false
                System.out.println("Unreachable for loop code");
            }
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