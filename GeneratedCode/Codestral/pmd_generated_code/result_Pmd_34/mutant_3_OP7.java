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

        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This is an unreachable while loop
            System.out.println("This line will never be printed.");
        }
    }
}