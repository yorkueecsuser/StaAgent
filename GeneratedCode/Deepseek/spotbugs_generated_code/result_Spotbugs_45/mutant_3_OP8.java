class UWFNullFieldBug {
    // This field is only ever set to null
    private String u = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public void setUselessField(String value) {
        u = value; // The bug is here - the field should never be set to a non-null value
    }

    public String getUselessField() {
        return u;
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}