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
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }

    // New unreachable while loop added based on the mutation operator information
    public void unreachableWhileLoop() {
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This is the code inside the unreachable while loop
        }
    }
}