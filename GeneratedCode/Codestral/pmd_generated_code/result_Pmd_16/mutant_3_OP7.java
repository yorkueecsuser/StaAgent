class BugExample {

    public void showBug() {
        boolean mutantCondition = false;
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // BUG: AvoidLosingExceptionInformation, the information from the exception is not used
            se.getMessage();
            // Unreachable while loop mutant
            while (mutantCondition) {
                System.out.println("This code is unreachable");
            }
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}