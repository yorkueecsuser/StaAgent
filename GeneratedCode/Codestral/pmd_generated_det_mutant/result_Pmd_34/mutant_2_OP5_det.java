class BuggyException extends Throwable { // BUG: DoNotExtendJavaLangThrowable
    private String message;

    public BuggyException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        int kywiinyr = 0;switch  (kywiinyr) {case 1:byte hjmaldmu = 4;break;default:short xgnzbhjp = -1485;break;}
        System.out.println(message);
    
}
}