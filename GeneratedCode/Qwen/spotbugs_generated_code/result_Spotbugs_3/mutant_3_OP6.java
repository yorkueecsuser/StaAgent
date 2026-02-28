class NonNullFieldExample {

    private String nonNullField; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldExample() {
        // Constructor does not initialize nonNullField
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop
        }
    }

    public String showBug() {
        return nonNullField; // This will throw a NullPointerException if nonNullField is accessed without initialization
    }

    public static void main(String[] args) {
        NonNullFieldExample example = new NonNullFieldExample();
        System.out.println(example.showBug()); // Demonstrates the bug
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}