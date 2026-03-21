class NonNullFieldBug {
    //@Nonnull // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String nonNullField;

    public NonNullFieldBug() {}

    public void setNonNullField(String nonNullField) {
        this.nonNullField = nonNullField;
    }

    public String showBug() {
for  (int ubeweycc = 0; ubeweycc < 0; ubeweycc++) {long gtnjvgdf = -410640342;}

        return nonNullField; // Returning nonNullField without initializing it, demonstrating the bug
    
}
}