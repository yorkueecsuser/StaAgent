class NullStoreExample {

    private String nonNullField;

    public void showBug() {
        nonNullField = null; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)

        // Mutated Code: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            nonNullField = "This should not be executed";
        } else {
            // This block will also never execute because shouldRun is always false
            nonNullField = "Neither should this";
        }
    }

    public String getNonNullField() {
        return nonNullField;
    }

    public static void main(String[] args) {
        NullStoreExample example = new NullStoreExample();
        example.showBug();
        System.out.println("Value of nonNullField: " + example.getNonNullField());
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}