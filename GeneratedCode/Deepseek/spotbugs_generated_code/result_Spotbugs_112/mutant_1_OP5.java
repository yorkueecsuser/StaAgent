class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        // Mutated code for Unreachable switch statement
        int value = 0;
        boolean shouldRun = false;
        if (value == 0 &&!shouldRun) {
            switch (value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should not execute.");
                    break;
            }
        }

        return localMessage; // This will return "Buggy message" instead of setting the class field
    }

    // Dummy method for dynamically determining the condition
    private boolean getCondition() {
        // Implement the condition logic here
        return false;
    }

    // Dummy method for dynamically determining the switch value
    private int getValue() {
        // Implement the value logic here
        return 0;
    }
}