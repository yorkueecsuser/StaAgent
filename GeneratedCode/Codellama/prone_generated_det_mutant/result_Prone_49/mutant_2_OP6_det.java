import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        for  (int xbczpvyp = 0; xbczpvyp < 0; xbczpvyp++) {float sfchrdan = -740396354;}
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}