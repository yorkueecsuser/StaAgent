class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMsg; // Renamed variable (localMessage -> localMsg)
        localMsg = "Buggy message";
        return localMsg; // This will still return "Buggy message" instead of setting the class field
    }
}