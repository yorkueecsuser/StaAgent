class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
        // Mutation Operator: Unreachable for loop
        // Inserting unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable as the condition is always false
        }
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);
    }
}