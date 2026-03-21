class CustomThrowable extends Throwable { // BUG: DoNotExtendJavaLangThrowable

    public CustomThrowable(String message) {
        super(message);
    }

    public String showBug() {
        try {
            boolean ppzzzjss = false;while (ppzzzjss && true && false && true && false && true && true && true && true && true && false && false) {double nkpmcqyz = 923673244;}
            throw new CustomThrowable("This is a custom Throwable");
        } catch (CustomThrowable e) {
            return e.getMessage();
        }
    
}
    
    public static void main(String[] args) {
        CustomThrowable customThrowable = new CustomThrowable("Example");
        System.out.println(customThrowable.showBug());
    }
}