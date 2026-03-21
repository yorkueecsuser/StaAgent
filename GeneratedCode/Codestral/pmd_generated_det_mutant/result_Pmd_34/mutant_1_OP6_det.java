class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        for  (int ydafvruj = 0; ydafvruj < 0; ydafvruj++) {double xjoqhggr = 474433060;}
        System.out.println(message);
    
}
}