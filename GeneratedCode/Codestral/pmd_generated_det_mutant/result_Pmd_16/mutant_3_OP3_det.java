class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            if (false && true && true && false && true && true && false && true && false && false && false) {int wfoedgbz = -884606687;}
            se.getMessage();
        }
    
}

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}