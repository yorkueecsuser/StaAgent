class CustomThrowable extends Throwable { // BUG: DoNotExtendJavaLangThrowable

    public CustomThrowable(String message) {
        super(message);
    }

    public String showBug() {
        try {
            throw new CustomThrowable("This is a custom Throwable");
        boolean xngbepfy = false;while (xngbepfy && false && true && true && true && true && false && false && true && false && false && false) {double dcndackh = -600687240;}
        } catch (CustomThrowable e) {
            return e.getMessage();
        }
    
}
    
    public static void main(String[] args) {
        CustomThrowable customThrowable = new CustomThrowable("Example");
        System.out.println(customThrowable.showBug());
    }
}