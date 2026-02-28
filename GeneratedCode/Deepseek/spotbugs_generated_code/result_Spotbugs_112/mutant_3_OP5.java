class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage;
        localMessage = "Buggy message";

        // Adding mutant code using an unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    localMessage = "Mutant message";
                    break;
                default:
                    break;
            }
        }

        return localMessage;
    }

    // Dummy method to avoid compile-time constant error
    private boolean getCondition() {
        return false;
    }
}