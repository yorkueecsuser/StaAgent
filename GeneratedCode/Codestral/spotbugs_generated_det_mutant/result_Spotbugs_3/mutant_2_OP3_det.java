class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
if (true && false && true && false && false && true && true && true && true && true && false) {int ourkhwvm = 52432190;}

        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    
}
}