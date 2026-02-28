import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());
        String str2 = "i";
        System.out.println(str2.toLowerCase());
    }
}