class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message; // Original assignment
        this.message = message; // Duplicated assignment
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);
    }
}