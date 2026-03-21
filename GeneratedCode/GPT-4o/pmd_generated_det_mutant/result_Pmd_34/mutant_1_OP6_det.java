class CustomThrowable extends Throwable { // BUG: DoNotExtendJavaLangThrowable

    public CustomThrowable(String message) {
        super(message);
    }

    public String showBug() {
        try {
            for  (int kzolnbjj = 0; kzolnbjj < 0; kzolnbjj++) {double pfwjbjpg = 851815402;}
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