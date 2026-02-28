class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    private boolean isFalse() {
        return false;
    }

    public String showBug() {
        for (int i = 0; isFalse(); i++) {
            // This loop is unreachable
        }
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }
}