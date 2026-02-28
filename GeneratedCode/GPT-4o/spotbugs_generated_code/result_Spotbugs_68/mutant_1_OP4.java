class ArgumentOrderBugDemo {

    // A simple method that checks if an object is not null and throws an exception if it is.
    public static <T> T checkNotNull(T reference, String message) {
        if (reference == null) {
            throw new NullPointerException(message);
        }
        return reference;
    }

    // A method to get a condition dynamically for demonstration purposes
    private boolean getFalseCondition() {
        return false;
    }

    // Method to demonstrate the bug
    public String showBug(String value, String message) {
        // Intentionally reversing the arguments
        checkNotNull(message, value); // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)

        // Unreachable if-else statement added
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed because the condition is always false.");
        } else {
            System.out.println("This is an artificial else branch to demonstrate the mutation.");
        }

        return value;
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