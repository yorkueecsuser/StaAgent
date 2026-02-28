class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value
        if (getCondition()) {
            // Unreachable if-else statement mutant
            System.out.println("This line will never be executed.");
        } else {
            System.out.println("This line will also never be executed.");
        }
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }

    private boolean getCondition() {
        return false;
    }
}