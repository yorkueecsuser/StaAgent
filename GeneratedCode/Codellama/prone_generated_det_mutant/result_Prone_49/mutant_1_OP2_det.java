import java.util.Formatter;

class FloggerFormatString {
public static void main(String [] args){
    Formatter formatter = new Formatter();
    formatter = new Formatter();
    String message = "Hello, %s!";
    String name = "John";
    formatter.format(message , name);
    System.out.println(formatter.toString());
}
}