class CustomThrowable extends Throwable { // BUG: DoNotExtendJavaLangThrowable

    public CustomThrowable(String message) {
        super(message);
    }

    public String showBug() {
        try {
            boolean acawafbs = false;while (acawafbs && false && false && false && false && true && false && true && true && true && true && false) {long jwtzpguw = 791042158;}
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