class FieldMaskingBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug(String message) {
        String localMessage = "Buggy message"; // Original bug

        // Unreachable switch statement mutant
        boolean shouldSwitch = getFalseCondition();
        if (shouldSwitch) {
            int value = 1;
            switch(value) {
                case 2:
                    // This code is unreachable as the case condition (2) will never be true
                    localMessage = "Unreachable code";
                    break;
            }
        }

        return localMessage; // Still returns "Buggy message" due to the original bug
    }

    private boolean getFalseCondition() {
        return false;
    }
}