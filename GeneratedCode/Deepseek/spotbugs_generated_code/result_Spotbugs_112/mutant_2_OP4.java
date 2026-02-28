class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable
            return message; // This will return the parameter message instead of setting the class field
        }

        return localMessage; // This will return "Buggy message" instead of setting the class field
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the branch unreachable
    }
}