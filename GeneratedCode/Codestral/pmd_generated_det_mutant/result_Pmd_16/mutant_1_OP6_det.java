class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            for  (int ccjnrbia = 0; ccjnrbia < 0; ccjnrbia++) {int gdlquxhw = 225656619;}
            se.getMessage();
        }
    
}

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}