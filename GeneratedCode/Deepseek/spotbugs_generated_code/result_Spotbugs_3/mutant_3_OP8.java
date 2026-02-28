class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nNFld;

    public NonNullFieldBug() {}

    public void setNonNullField(String nNFld) {
        this.nNFld = nNFld;
    }

    public String showBug() {
        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    }
}