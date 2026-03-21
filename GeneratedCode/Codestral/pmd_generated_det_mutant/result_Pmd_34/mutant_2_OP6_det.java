class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        for  (int phgwnxfb = 0; phgwnxfb < 0; phgwnxfb++) {byte mqqwguup = 75;}
        System.out.println(message);
    
}
}