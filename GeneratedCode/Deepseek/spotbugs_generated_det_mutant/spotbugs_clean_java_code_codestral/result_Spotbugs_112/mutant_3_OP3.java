class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage;
        localMessage = "Buggy message";

        boolean unreachableCondition = getCondition();
        if (unreachableCondition) { // Mutant: Unreachable if statement
            System.out.println("This line will never execute");
        }

        return localMessage;
    }

    private boolean getCondition() {
        return false; // Always return false to make the if statement unreachable
    }
}