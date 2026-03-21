class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            for  (int qbdgvxku = 0; qbdgvxku < 0; qbdgvxku++) {boolean gtbpkyan = false;}
            se.getMessage();
        }
    
}

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}