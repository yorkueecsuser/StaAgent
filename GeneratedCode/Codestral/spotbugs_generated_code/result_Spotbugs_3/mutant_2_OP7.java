class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {
        boolean condition = getCondition();
        while (condition) {
            // This is an unreachable loop as the condition is always false
            // This is added to implement the mutation operator "Unreachable while loop"
        }
    }

    private boolean getCondition() {
        return false; // this will always return false, making the loop unreachable
    }

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }
}