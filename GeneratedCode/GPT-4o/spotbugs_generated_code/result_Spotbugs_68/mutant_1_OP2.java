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
        String duplicatedMessage; // Declare a variable to hold the duplicate assignment
        // Intentionally reversing the arguments
        checkNotNull(message, value); // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        duplicatedMessage = "This is a duplication"; // Assignment statement to be duplicated
        duplicatedMessage = "This is a duplication"; // Duplicate the assignment statement
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