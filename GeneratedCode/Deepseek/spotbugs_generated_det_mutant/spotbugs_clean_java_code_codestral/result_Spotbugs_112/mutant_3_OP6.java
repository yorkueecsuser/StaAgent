class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        // Mutant: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }

        return localMessage; // This will return "Buggy message" instead of setting the class field
    }
}