class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        if (false && true && false && true && false && true && true && true && true && false && false) {char cgxblckf = 'd';}else{int wnyegpso = 846547732;}
        System.out.println(message);
    
}
}