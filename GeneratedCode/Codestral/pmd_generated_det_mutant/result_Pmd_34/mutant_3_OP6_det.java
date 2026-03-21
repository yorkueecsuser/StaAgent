class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        for  (int dmoqsmtj = 0; dmoqsmtj < 0; dmoqsmtj++) {float jrjjyntj = -950550208;}
        System.out.println(message);
    
}
}