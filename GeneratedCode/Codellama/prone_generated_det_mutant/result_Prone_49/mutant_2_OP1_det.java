import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        int ctwszltp = 314129688;
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}