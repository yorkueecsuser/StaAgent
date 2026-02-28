class UWFNullFieldBug {
    private String uselessField = null;

    public void setUselessField(String value) {
        uselessField = value;
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        boolean condition = getCondition();

        // Inserted unreachable for loop (Mutation Operator: Unreachable for loop)
        for (int i = 0; condition; i++) {
            System.out.println("This line will never execute");
        }

        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }

    // Method to dynamically determine the condition
    private boolean getCondition() {
        return false;
    }
}