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
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always false to make the condition unreachable
    }
}