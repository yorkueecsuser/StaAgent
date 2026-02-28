import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        String zyxwvut = "original"; // Dead Store
        System.out.println(str.toLowerCase());
    }
}