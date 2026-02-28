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
        
        // Unreachable if-else statement mutation
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            System.out.println("This block will never execute.");
        } else {
            // This block will always execute
            System.out.println("Executing normally.");
        }
        
        return value;
    }

    // Method to simulate a condition at runtime
    private boolean getCondition() {
        return false; // Ensures that the if block above is never executed
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