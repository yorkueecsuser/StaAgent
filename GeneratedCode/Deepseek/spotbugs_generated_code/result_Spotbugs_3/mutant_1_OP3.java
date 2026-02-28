class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
        // Mutant code: unreachable if statement
        if (isUnreachable()) {
            System.out.println("Unreachable code block");
        }
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }

    // Method to ensure the if statement is always false
    private boolean isUnreachable() {
        return false;
    }
}