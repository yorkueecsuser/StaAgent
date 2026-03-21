class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        if (getFalseCondition()) {
            // Unreachable code
            return "Unreachable code";
        } else {
            return nonNullField;
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}