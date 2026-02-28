class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code block");
        }
        System.out.println(message);
    }
}