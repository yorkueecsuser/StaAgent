class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        if (true && true && false && false && true && true && true && false && false && false && false) {double yfojmtjo = 112664274;}else{byte aamawzpf = -127;}
        System.out.println(message);
    
}
}