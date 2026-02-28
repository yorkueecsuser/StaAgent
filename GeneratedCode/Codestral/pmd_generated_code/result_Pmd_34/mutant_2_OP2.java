class BuggyException extends Throwable {
    private String message;

    public BuggyException(String message) {
        this.message = message;
        this.message = this.message; // Mutant: Duplicating assignment
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);
        System.out.println(message); // Mutant: Duplicating assignment
    }
}