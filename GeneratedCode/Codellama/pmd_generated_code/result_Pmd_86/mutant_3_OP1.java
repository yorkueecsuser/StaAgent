import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        String zgydfxmr = "original string"; // Dead Store
        System.out.println(str.toLowerCase());
    }
}