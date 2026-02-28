class ArgumentOrderBugDemo {

    // A simple method that checks if an object is not null and throws an exception if it is.
    public static <T> T checkNotNull(T x, String message) { // Renamed 'reference' to 'x'
        if (x == null) {
            throw new NullPointerException(message);
        }
        return x;
    }

    // Method to demonstrate the bug
    public String showBug(String value, String y) { // Renamed 'message' to 'y'
        // Intentionally reversing the arguments
        checkNotNull(y, value); // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
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