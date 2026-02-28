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

        // Unreachable if statement mutant
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This code will never execute.");
        }
    }

    private boolean getCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}