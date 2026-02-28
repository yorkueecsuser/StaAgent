class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";
        localMessage = "Duplicated message"; // Mutant: Duplicated assignment statement
        return localMessage; // This will still return "Duplicated message" instead of setting the class field
    }
}