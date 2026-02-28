class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
        // Mutation: Duplicating the assignment statement
        this.message = this.message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(message);
        // Mutation: Duplicating the assignment statement
        message = message;
    }
}