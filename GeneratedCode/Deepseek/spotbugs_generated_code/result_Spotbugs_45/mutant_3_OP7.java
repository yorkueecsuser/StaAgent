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
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop mutant
            System.out.println("This line will never be executed");
        }
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }

    private boolean getCondition() {
        return false; // Always returns false to make the while loop unreachable
    }
}