class UWFNullFieldBug {
    private String uselessField = null;

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value
        uselessField = value; // Duplicated assignment statement
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}