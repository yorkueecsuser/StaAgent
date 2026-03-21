class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    // Dead Store Mutation: Adding an unused variable declaration
    private int deadStoreVariable = 5;  // A dead store variable that is never used

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}