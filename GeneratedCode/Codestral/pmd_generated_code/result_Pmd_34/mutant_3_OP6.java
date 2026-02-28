class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Inserting unreachable for loop
            System.out.println("This code will never be executed.");
        }
        System.out.println(message);
    }
}