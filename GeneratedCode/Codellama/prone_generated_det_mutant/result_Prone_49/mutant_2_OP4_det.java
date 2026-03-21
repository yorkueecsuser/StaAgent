import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        if (true && true && true && true && true && false && true && true && false && true && false) {boolean iwgluaal = false;}else{long vccmmbzs = -987362755;}
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}