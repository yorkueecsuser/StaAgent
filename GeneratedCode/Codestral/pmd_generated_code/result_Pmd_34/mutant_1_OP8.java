class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;
    private String a; // Mutant: Renamed'message' to 'a'

    public BuggyException(String message) {
        this.a = message; // Mutant: Updated the reference to the new variable name
    }

    public String getMessage() {
        return a; // Mutant: Updated the return statement to the new variable name
    }

    public void showBug() {
        System.out.println(a); // Mutant: Updated the print statement to the new variable name
    }
}