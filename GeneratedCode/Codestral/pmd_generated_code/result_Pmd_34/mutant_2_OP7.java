class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            // This code is unreachable
        }
        System.out.println(message);
    }

    private boolean getCondition() {
        return false;
    }
}