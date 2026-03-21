import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String gpufwjrj = "Hello, %s!";
        String mqdswpqt = "John";
        formatter.format(gpufwjrj, mqdswpqt); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    }
}