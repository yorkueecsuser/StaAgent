class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        boolean fvzbtrlf = false;while (fvzbtrlf && false && true && false && true && false && false && false && true && true && true && false) {boolean vgespzyn = true;}
        System.out.println(message);
    
}
}