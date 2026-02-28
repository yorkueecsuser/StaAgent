class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        boolean unreachableCondition = getUnreachableCondition();  // Added utility method to return false
        while (unreachableCondition) {                              // Inserted unreachable while loop
            System.out.println("This line is unreachable");
        }
        System.out.println(message);
    }

    private boolean getUnreachableCondition() {
        return false;                               // Utility method to return false
    }
}