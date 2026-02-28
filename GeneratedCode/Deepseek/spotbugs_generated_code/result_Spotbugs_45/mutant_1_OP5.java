class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public void setUselessField(String value) {
        boolean condition = false; // The switch condition should always be false to make the statement unreachable
        switch (condition) { // Unreachable switch statement
            case true:
                uselessField = value; // The bug is here - the field should never be set to a non-null value
                break;
            default:
                break;
        }
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}