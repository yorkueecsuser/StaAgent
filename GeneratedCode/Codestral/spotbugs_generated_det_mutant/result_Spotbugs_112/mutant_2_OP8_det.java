class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String fiyzhczr; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        fiyzhczr = "Buggy message";
        return fiyzhczr; // This will return "Buggy message" instead of setting the class field
    }
}