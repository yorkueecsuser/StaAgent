class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();

            // Mutant code: Unreachable switch statement
            switch (Boolean.FALSE) {
                case true:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}