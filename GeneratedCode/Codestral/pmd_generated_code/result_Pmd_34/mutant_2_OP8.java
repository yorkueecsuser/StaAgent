class BuggyException extends Throwable {
    private String message;
    private String a;

    public BuggyException(String message) {
        this.message = message;
        this.a = message; // Added code to initialize 'a' with the value of'message'
    }

    public String getMessage() {
        return a; // Modified code to return the value of 'a' instead of'message'
    }

    public void showBug() {
        System.out.println(a); // Modified code to print the value of 'a' instead of'message'
    }
}