class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    private String deadStoreVariable; // Added dead store variable

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        deadStoreVariable = "This variable is never used"; // The dead store variable is set but never used
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}