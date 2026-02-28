class NonNullFieldExample {

    private String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldExample() {
        // Constructor does not initialize nonNullField
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            nonNullField = "Reachable Initialization";
        } else {
            // This block is unreachable because getCondition() always returns false
            nonNullField = "Unreachable Initialization";
        }
    }

    private boolean getCondition() {
        // Always returns false to ensure the else block is unreachable
        return false;
    }

    public String showBug() {
        return nonNullField; // This will throw a NullPointerException if nonNullField is accessed without initialization
    }

    public static void main(String[] args) {
        NonNullFieldExample example = new NonNullFieldExample();
        System.out.println(example.showBug()); // Demonstrates the bug
    }
}