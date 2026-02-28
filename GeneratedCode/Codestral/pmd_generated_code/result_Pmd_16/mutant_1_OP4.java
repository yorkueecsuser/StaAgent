class BugExample {

    public void showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            try {
                throw new SomeException("Example Exception");
            } catch (SomeException se) {
                se.getMessage();
            }
        } else {
            // Unreachable if-else branch
            System.out.println("This line of code is unreachable.");
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