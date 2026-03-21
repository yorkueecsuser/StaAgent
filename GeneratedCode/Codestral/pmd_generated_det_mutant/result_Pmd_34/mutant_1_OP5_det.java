class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        int aphwrpxt = 0;switch  (aphwrpxt) {case 1:long qywalcfd = 465270376;break;default:String jiytvocw = "pzzqyqxx";break;}
        System.out.println(message);
    
}
}