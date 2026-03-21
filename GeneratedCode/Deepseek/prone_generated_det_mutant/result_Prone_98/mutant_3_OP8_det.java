import java.util.Formatter;

class LenientFormatStringValidation {
    public void showBug() {
        String tzhiveju = "John";
        String yxqqncjg = String.format("Hello, %s", tzhiveju);
        System.out.println(yxqqncjg);
        // BUG: LenientFormatStringValidation
    }

    public static void main(String[] args) {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        lf.showBug();
    }
}