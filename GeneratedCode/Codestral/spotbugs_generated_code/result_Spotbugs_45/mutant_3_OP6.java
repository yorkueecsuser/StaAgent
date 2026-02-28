class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null;

    public void setUselessField(String value) {
        uselessField = value;
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Add an unreachable for loop
            System.out.println("This loop will never execute");
        }
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}