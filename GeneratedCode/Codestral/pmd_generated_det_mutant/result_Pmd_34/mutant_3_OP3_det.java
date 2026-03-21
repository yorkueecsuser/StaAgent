class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        if (false && false && true && false && false && false && true && true && true && false && false) {double jpkbrytp = -707240283;}
        System.out.println(message);
    
}
}