class BugExample {

    public void showBug() {
        int deadStoreVariable; // Dead store mutant
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            se.getMessage();
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}