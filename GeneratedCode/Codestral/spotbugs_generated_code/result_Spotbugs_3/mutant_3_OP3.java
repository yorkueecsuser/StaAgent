class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        // Adding unreachable if branch
        if (getFalseCondition()) {
            System.out.println("This line will never be executed");
        }
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }

    private boolean getFalseCondition() {
        return false; // Always return false to make if branch unreachable
    }
}