class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);

        // Mutant code: Unreachable switch statement
        boolean condition = getCondition();
        if (!condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
    }

    // Method to dynamically determine the condition at runtime
    private boolean getCondition() {
        return false;
    }

    // Method to dynamically determine the switch value at runtime
    private int getValue() {
        return 0;
    }
}