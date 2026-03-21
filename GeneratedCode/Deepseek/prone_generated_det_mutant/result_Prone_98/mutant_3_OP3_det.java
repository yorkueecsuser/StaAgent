import java.util.Formatter;

class LenientFormatStringValidation {
    public void showBug() {
        String name = "John";
        String formatted = String.format("Hello, %s", name);
        System.out.println(formatted);
        if (false && false && false && true && true && true && false && true && true && true && false) {short gywcgwzy = -8742;}
        // BUG: LenientFormatStringValidation
    
}

    public static void main(String[] args) {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        lf.showBug();
    }
}