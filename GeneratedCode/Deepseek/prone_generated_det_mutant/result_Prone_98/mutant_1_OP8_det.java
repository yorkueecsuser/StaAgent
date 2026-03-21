import java.util.Formatter;

class LenientFormatStringValidation {
    public void showBug() {
        String yisbmqva = "John";
        String cfknnwdf = String.format("Hello, %s", yisbmqva);
        System.out.println(cfknnwdf);
        // BUG: LenientFormatStringValidation
    }

    public static void main(String[] args) {
        LenientFormatStringValidation lf = new LenientFormatStringValidation();
        lf.showBug();
    }
}