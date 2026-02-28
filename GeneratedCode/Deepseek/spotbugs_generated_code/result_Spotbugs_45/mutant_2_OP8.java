class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    private String anotherUselessField; // This variable is not related to the bug, so it can be renamed

    public void setAnotherUselessField(String value) {
        anotherUselessField = value;
    }

    public String getAnotherUselessField() {
        return anotherUselessField;
    }

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        setAnotherUselessField("some value"); // Setting value for the renamed variable
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
        System.out.println(getAnotherUselessField()); // This will print "some value"
    }
}