class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        // Mutant code: Unreachable if-else statement
        if (isUnreachableCondition()) {
            // This code is unreachable
            String unreachableMessage = "Unreachable message";
            return unreachableMessage;
        } else {
            // This code is reachable
            return localMessage; // This will return "Buggy message" instead of setting the class field
        }
    }

    private boolean isUnreachableCondition() {
        // Replace this with a condition that is always false
        return false;
    }
}