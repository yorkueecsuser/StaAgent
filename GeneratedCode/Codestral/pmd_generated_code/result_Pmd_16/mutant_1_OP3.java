class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // Adding a mutant
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                System.out.println("This code is unreachable.");
            }

            // Original code
            se.getMessage();
        }
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}