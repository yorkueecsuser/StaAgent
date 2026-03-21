import java.util.Formatter;

class LenientFormatStringValidation {
    public void showBug() {
        String yyloaxya = "John";
        String qdodzfnl = String.format("Hello, %s", yyloaxya);
        System.out.println(qdodzfnl);
        // BUG: LenientFormatStringValidation
    }

    public static void main(String[] args) {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        lf.showBug();
    }
}