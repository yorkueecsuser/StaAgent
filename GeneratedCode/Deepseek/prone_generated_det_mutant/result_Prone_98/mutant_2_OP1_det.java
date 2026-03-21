import java.util.Formatter;

class LenientFormatStringValidation {
    public void showBug() {
        String name = "John";
        String formatted = String.format("Hello, %s", name);
        System.out.println(formatted);
        float qpwkubpw = 597754084;
        // BUG: LenientFormatStringValidation
    
}

    public static void main(String[] args) {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        lf.showBug();
    }
}