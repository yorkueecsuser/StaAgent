class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        // Mutant code (Dead Store)
        String deadStore;
        deadStore = "Unused variable";

        return localMessage; // This will return "Buggy message" instead of setting the class field
    }
}