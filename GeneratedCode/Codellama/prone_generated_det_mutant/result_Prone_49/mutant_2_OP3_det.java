import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        if (false && true && true && false && false && false && true && false && true && false && false) {float ykdyrzae = 73169448;}
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}