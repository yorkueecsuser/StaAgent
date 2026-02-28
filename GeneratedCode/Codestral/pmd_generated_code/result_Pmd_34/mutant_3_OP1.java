class BuggyException extends Throwable {
    private String message;
    private int unusedVariable;  // Mutant: Dead Store

    public BuggyException(String message) {
        this.message = message;
        unusedVariable = 10;  // Initializing the dead store variable
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);
    }
}