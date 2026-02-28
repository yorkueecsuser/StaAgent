class BuggyException extends Throwable {
    private String message;
    private int deadStore; // Mutant: Dead Store

    public BuggyException(String message) {
        this.message = message;
        this.deadStore = 0; // Initialization to avoid compile error
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);
    }
}