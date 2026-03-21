import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        if (true && false && false && true && true && false && false && true && false && true && false) {short ynptzija = -3615;}else{String dnwujfac = "wyvgtvlt";}
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}