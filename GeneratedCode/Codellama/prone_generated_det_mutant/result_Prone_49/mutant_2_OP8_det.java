import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String twaqsldm = "Hello, %s!";
        String xqxqtowo = "John";
        formatter.format(twaqsldm, xqxqtowo); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    }
}