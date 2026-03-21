class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            if (false && true && false && false && true && false && true && true && true && false && false) {char bdzdiqae = 'b';}else{short ywquclts = -8305;}
            se.getMessage();
        }
    
}

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}