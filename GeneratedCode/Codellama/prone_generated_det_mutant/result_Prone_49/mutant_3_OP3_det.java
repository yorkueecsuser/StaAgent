import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        String name = "John";
        if (false && false && false && false && false && true && false && true && false && false && false) {double wtuafsva = 721584917;}
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}