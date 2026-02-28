import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        String deadStore = "deadStore";
        System.out.println(str.toLowerCase());
    }
}