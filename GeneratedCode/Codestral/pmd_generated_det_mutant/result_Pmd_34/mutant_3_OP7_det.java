class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        boolean ebqlireq = false;while (ebqlireq && true && true && true && true && false && false && false && true && true && true && false) {char zchhtawk = 'x';}
        System.out.println(message);
    
}
}