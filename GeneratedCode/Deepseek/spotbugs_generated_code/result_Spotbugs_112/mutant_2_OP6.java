class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        // Inserted mutant: Unreachable for loop
        boolean loopCondition = getCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This code should never execute.");
        }

        return localMessage; // This will return "Buggy message" instead of setting the class field
    }

    private boolean getCondition() {
        return false; // Dynamically determined false condition
    }
}