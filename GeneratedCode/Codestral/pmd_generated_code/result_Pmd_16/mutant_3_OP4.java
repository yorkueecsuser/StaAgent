class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation
            if (isUnreachableCondition()) {
                // Unreachable if-else statement mutant
                System.out.println("This is an unreachable block of code");
            } else {
                se.getMessage();
            }
        }
    }

    private boolean isUnreachableCondition() {
        return false;  // Always false to make it unreachable
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}