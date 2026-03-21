import java.util.Formatter;

class LenientFormatStringValidation {
    public void showBug() {
        String name = "John";
        String formatted = String.format("Hello, %s", name);
        System.out.println(formatted);
        for  (int xnhmncbs = 0; xnhmncbs < 0; xnhmncbs++) {double tqiqqynl = 184260666;}
        // BUG: LenientFormatStringValidation
    
}

    public static void main(String[] args) {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        lf.showBug();
    }
}