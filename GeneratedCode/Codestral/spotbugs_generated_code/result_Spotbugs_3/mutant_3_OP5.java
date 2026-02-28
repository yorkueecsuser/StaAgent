class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:
                this.nonNullField = "Unreachable Code";
                break;
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }
}