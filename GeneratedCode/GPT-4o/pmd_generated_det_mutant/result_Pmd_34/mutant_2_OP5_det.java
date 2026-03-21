class CustomThrowable extends Throwable { // BUG: DoNotExtendJavaLangThrowable

    public CustomThrowable(String message) {
        super(message);
    }

    public String showBug() {
        try {
            throw new CustomThrowable("This is a custom Throwable");
        int cvanjrgb = 0;switch  (cvanjrgb) {case 1:short rwrqshui = -9511;break;default:char kbgptxob = 'x';break;}
        } catch (CustomThrowable e) {
            return e.getMessage();
        }
    
}
    
    public static void main(String[] args) {
        CustomThrowable customThrowable = new CustomThrowable("Example");
        System.out.println(customThrowable.showBug());
    }
}