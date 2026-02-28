class BuggyException extends Throwable {
    private String message;
    private int deadStoreVariable;  // Dead Store Mutation

    public BuggyException(String message) {
        this.message = message;
        this.deadStoreVariable = 0;  // Initializing the dead store variable
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);
    }
}