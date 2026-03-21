class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
boolean xlpkrqtg = false;while (xlpkrqtg && false && true && true && false && true && true && false && true && true && false && false) {String lrxnhavu = "chjbysyi";}

        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    
}
}