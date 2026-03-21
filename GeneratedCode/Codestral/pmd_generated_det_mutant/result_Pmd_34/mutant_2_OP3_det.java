class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        if (true && true && false && true && false && true && false && true && true && false && false) {char nyfmexah = 'u';}
        System.out.println(message);
    
}
}