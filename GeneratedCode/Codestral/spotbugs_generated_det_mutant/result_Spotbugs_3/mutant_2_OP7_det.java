class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
boolean lpksdusf = false;while (lpksdusf && false && false && true && false && true && false && false && false && false && false && false) {double gmuliubi = -223495788;}

        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    
}
}