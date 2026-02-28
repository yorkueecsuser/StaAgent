class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";
        String a; // Mutant code: Renaming localMessage to a
        a = localMessage;
        return a; // This will still return "Buggy message" instead of setting the class field
    }
}