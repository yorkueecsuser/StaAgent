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
        
        // Adding an unreachable if-else statement
        boolean condition = getCondition(); // Dynamically determined at runtime
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This is the else branch");
        }

        return value;
    }

    // Method to simulate a runtime condition
    public boolean getCondition() {
        return false;
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