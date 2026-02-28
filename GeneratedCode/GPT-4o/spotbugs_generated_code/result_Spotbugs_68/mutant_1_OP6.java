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
        // Unreachable for loop added as a mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is intentionally left empty
        }
        
        // Intentionally reversing the arguments
        checkNotNull(message, value); // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        return value;
    }

    // Method to simulate a dynamic condition
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