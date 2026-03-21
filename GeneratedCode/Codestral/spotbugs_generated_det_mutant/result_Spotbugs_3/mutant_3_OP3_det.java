class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
if (true && true && true && false && true && true && false && true && false && false && false) {char fchnbvxs = 'n';}

        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    
}
}