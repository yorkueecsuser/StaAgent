class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        boolean wquueisy = false;while (wquueisy && true && false && true && false && false && false && false && false && false && false && false) {char ldnehenp = 'd';}
        System.out.println(message);
    
}
}