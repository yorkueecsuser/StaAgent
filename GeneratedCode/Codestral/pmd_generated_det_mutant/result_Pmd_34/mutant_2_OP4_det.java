class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        if (true && false && false && true && false && true && true && false && true && true && false) {float zzbisdlr = 459236618;}else{short eszxwmwj = 677;}
        System.out.println(message);
    
}
}