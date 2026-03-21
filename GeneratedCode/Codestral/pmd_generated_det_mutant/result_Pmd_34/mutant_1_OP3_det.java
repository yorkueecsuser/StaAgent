class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        if (true && false && true && false && true && true && true && false && true && false && false) {byte yfmiwxjq = 122;}
        System.out.println(message);
    
}
}