class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            if (false && true && false && false && false && true && true && true && true && true && false) {boolean qomcqwon = false;}
            se.getMessage();
        }
    
}

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}