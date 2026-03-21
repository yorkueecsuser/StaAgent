import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String ugczlazt = "İ";
        System.out.println(ugczlazt.toLowerCase());
    }
}