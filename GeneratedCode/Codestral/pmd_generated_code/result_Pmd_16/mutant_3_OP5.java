class BugExample {

    public void showBug() {
        try {
            throw new SomeException("Example Exception");
        } catch (SomeException se) {
            // Original code
            se.getMessage();

            // Mutant code: Unreachable switch statement
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    // This code is unreachable because getUnreachableValue() never returns 1
                    System.out.println("This is an unreachable code block");
                    break;
                default:
                    // Default case is also unreachable
                    System.out.println("This is also an unreachable code block");
            }
        }
    }

    private int getUnreachableValue() {
        // This method always returns 0, which makes the switch statement unreachable
        return 0;
    }

    private static class SomeException extends Exception {
        SomeException(String message) {
            super(message);
        }
    }
}