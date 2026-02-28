class UWFNullFieldBug {
    // This field is only ever set to null
    private String uselessField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public void setUselessField(String value) {
        uselessField = value; // The bug is here - the field should never be set to a non-null value

        // Mutation: Unreachable switch statement
        boolean shouldNotEnterSwitch = getCondition();
        if (!shouldNotEnterSwitch) {
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    // This code is unreachable
                    System.out.println("This is an unreachable statement.");
                    break;
            }
        }
    }

    // Methods to support the unreachable switch statement
    private boolean getCondition() {
        return false;
    }

    private int getUnreachableValue() {
        return 0;
    }

    public String getUselessField() {
        return uselessField;
    }

    public void showBug() {
        setUselessField("non-null value");
        System.out.println(getUselessField()); // This will always print null, demonstrating the bug
    }
}