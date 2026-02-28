class NonNullFieldExample {

    private String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldExample() {
        // Constructor does not initialize nonNullField
        boolean shouldInitialize = getCondition(); // Dynamically determined condition
        if (shouldInitialize) {
            nonNullField = "Initialized";
        } else {
            // Unreachable if-else branch
            nonNullField = "Unreachable Initialization";
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false to ensure the else branch is unreachable
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