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

        // Inserted unreachable switch statement
        int unreachableSwitchVar = getUnreachableSwitchValue();
        switch (unreachableSwitchVar) {
            case 1:
                System.out.println("This will never be printed");
                break;
            default:
                break;
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

    // Helper method to ensure switch statement remains unreachable
    private int getUnreachableSwitchValue() {
        return 0; // This ensures the `case 1` is never hit
    }
}