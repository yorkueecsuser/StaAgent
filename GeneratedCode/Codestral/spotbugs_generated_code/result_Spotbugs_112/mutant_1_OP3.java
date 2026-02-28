class FieldMaskingBug {
    private String message;

    private boolean getUnreachableCondition() {
        return false;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage;
        localMessage = "Buggy message";

        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable.");
        }

        return localMessage;
    }
}