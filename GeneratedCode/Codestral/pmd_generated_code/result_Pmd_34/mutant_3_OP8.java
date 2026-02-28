class BuggyException extends Throwable {
    private String a; // Mutated name of the variable

    public BuggyException(String message) {
        a = message; // Using the mutated name of the variable
    }

    public String getMessage() {
        return a; // Using the mutated name of the variable
    }

    public void showBug() {
        System.out.println(a); // Using the mutated name of the variable
    }
}