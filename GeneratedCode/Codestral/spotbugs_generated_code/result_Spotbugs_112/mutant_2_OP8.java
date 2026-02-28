class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String msg) {
        String localMsg; // Renamed variable to demonstrate the renaming mutation operator
        localMsg = "Buggy message";
        return localMsg; // This will still return "Buggy message" instead of setting the class field
    }
}