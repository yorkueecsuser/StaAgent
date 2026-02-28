class NullPointerExceptionBug {
    private String nullString;

    public void initialize() {
        // This method is meant to be called under a certain condition,
        // but it's not in the scope of this demonstration, so the nullString remains null.
    }

    public String getNullStringLength() {
        // Added unreachable if statement
        if (getUnreachableCondition()) {
            // This block of code will never be executed
        }
        return "Length: " + nullString.length(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
    }

    public void showBug() {
        initialize();
        System.out.println(getNullStringLength()); // This will throw a NullPointerException
    }

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerExceptionBug bug = new NullPointerExceptionBug();
        bug.showBug();
    }
}