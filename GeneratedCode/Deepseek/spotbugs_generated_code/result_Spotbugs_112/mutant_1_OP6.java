class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage;
        localMessage = "Buggy message";

        // Added unreachable for loop
        boolean loopCondition = false;
        for (int i = 0; loopCondition; i++) {
            // This loop will never be executed
        }

        return localMessage;
    }
}