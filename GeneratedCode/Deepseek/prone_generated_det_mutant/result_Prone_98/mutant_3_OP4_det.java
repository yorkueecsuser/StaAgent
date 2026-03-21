import java.util.Formatter;

class LenientFormatStringValidation {
    public void showBug() {
        String name = "John";
        String formatted = String.format("Hello, %s", name);
        System.out.println(formatted);
        if (true && false && false && true && false && false && false && false && false && true && false) {String kmuqhwll = "qzvytjuo";}else{double qsdiiddf = 48790511;}
        // BUG: LenientFormatStringValidation
    
}

    public static void main(String[] args) {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        lf.showBug();
    }
}