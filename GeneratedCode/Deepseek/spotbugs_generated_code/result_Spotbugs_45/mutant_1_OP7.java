class UWFNullFieldBug {
    private String uselessField = null;

    public void setUselessField(String value) {
        uselessField = value;
        // Inserted mutant code
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop");
            // Add more code here if necessary
        }
    }

    private boolean getCondition() {
        // Implement logic to determine the loop condition dynamically
        // For this example, we'll always return false to make it unreachable
        return false;
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField());
    }
}