class ArgumentOrderBugDemo {

    // A simple method that checks if an object is not null and throws an exception if it is.
    public static <T> T checkNotNull(T ref, String msg) {
        if (ref == null) {
            throw new NullPointerException(msg);
        }
        return ref;
    }

    // Method to demonstrate the bug
    public String showBug(String v, String m) {
        // Intentionally reversing the arguments
        checkNotNull(m, v); // BUG: DMI: Reversed method arguments (DMI_ARGUMENTS_WRONG_ORDER)
        return v;
    }

    public static void main(String[] args) {
        ArgumentOrderBugDemo d = new ArgumentOrderBugDemo();
        try {
            d.showBug("This is a test message", null);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}