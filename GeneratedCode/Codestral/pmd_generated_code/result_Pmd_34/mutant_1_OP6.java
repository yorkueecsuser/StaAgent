class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        boolean conditionFor = getCondition();
        // Inserted unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be printed.");
        }

        System.out.println(message);
    }

    private boolean getCondition() {
        return false;   // Always returns false to make the loop unreachable
    }
}