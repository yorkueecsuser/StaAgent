import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String fleihblf = "Hello, %s!";
        String qmcoztow = "John";
        formatter.format(fleihblf, qmcoztow); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    }
}