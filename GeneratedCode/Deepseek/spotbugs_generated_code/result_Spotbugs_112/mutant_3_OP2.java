class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage;
        localMessage = "Buggy message";
        localMessage = "Duplicated buggy message"; // Mutant: Duplicate the assignment statement
        return localMessage;
    }
}