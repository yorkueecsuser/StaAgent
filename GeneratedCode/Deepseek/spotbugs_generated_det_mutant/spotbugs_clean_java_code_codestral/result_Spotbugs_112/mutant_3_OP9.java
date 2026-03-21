class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        localMessage = "Buggy message";

        // Mutant code: Add an equivalent do-while loop that doesn't change the functionality
        int i = 0;
        do {
            i++;
        } while (i < 1); // This loop has no effect on the code

        return localMessage; // This will return "Buggy message" instead of setting the class field
    }
}