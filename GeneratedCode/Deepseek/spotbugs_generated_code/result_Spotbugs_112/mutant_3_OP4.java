class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block will never execute
            System.out.println("This is an unreachable block");
        } else {
            // This block is always executed
            // The original bug is still present
            return localMessage; // This will return "Buggy message" instead of setting the class field
        }
    }
}