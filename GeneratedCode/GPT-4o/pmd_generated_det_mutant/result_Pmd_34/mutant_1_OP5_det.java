class CustomThrowable extends Throwable { // BUG: DoNotExtendJavaLangThrowable

    public CustomThrowable(String message) {
        super(message);
    }

    public String showBug() {
        try {
            throw new CustomThrowable("This is a custom Throwable");
        int boqnanww = 0;switch  (boqnanww) {case 1:byte klfiywes = 77;break;default:double fkalcrne = -928097280;break;}
        } catch (CustomThrowable e) {
            return e.getMessage();
        }
    
}
    
    public static void main(String[] args) {
        CustomThrowable customThrowable = new CustomThrowable("Example");
        System.out.println(customThrowable.showBug());
    }
}