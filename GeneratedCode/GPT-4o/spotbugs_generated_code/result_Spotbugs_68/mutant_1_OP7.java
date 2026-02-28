class ArgumentOrderBugDemo {

    // A simple method that checks if an object is not null and throws an exception if it is.
    public static <T> T checkNotNull(T reference, String message) {
        if (reference == null) {
            throw new NullPointerException(message);
        }
        return reference;
    }

    // Method to demonstrate the bug
    public String showBug(String value, String message) {
        // Intentionally reversing the arguments
        checkNotNull(message, value); // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false.
            System.out.println("This is unreachable code inside a while loop.");
        }

        return value;
    }

    // A method to ensure the condition is always false
    private boolean getCondition() {
        return false; // Ensures the while loop never executes, thus unreachable.
    }

    public static void main(String[] args) {
        ArgumentOrderBugDemo demo = new ArgumentOrderBugDemo();
        try {
            demo.showBug("This is a test message", null);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}