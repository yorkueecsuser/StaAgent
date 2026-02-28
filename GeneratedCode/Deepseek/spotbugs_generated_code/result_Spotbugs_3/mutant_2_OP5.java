class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
        boolean alwaysFalse = false; // Non-final variable always evaluates to false
        switch(alwaysFalse? 1 : 0) { // Unreachable switch statement
            case 1:
                // This code is unreachable
                break;
        }
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }
}