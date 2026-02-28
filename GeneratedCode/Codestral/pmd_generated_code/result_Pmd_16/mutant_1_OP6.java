class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // Added a mutated unreachable for loop.
            boolean condition = false;
            for (int i = 0; condition; i++) {
                System.out.println("Unreachable loop");
            }
            se.getMessage();
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}