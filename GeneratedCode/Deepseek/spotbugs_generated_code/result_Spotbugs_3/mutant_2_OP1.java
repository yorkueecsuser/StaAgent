class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;
    // Mutation: Dead Store
    private String deadStoreVariable = "unused";

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }
}