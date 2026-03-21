import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        for  (int xlbztdur = 0; xlbztdur < 0; xlbztdur++) {byte refvvyzy = 103;}
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}