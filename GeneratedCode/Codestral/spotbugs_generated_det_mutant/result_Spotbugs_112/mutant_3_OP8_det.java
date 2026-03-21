class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String mbsdmyjx; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        mbsdmyjx = "Buggy message";
        return mbsdmyjx; // This will return "Buggy message" instead of setting the class field
    }
}