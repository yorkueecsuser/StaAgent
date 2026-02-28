class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        if (getUnreachableCondition()) { // Mutant: Unreachable if statement
            System.out.println("This line is unreachable.");
        }
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}