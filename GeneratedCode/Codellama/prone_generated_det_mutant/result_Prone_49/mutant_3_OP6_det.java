import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        for  (int imjtdwlo = 0; imjtdwlo < 0; imjtdwlo++) {int fllchlys = 96725053;}
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}