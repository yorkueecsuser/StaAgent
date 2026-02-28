class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value

        // Mutation: Unreachable if statement
        if (getCondition()) { // The condition is always false to make this branch unreachable
            System.out.println("Unreachable code block");
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}