import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        boolean dvnmfdsb = false;while (dvnmfdsb && true && false && false && false && false && true && false && true && false && true && false) {double kvanulhu = -51166096;}
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}