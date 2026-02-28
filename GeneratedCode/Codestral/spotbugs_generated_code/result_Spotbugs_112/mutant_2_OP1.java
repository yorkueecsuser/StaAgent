class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // Original bug
        String deadStore; // Dead Store Mutation: Unused variable declaration
        deadStore = "Unused variable";
        localMessage = "Buggy message";
        return localMessage; // This will return "Buggy message" instead of setting the class field
    }
}