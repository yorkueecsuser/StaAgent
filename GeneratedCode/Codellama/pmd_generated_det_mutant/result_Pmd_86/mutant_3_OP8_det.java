import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String irnzhsrn = "İ";
        System.out.println(irnzhsrn.toLowerCase());
    }
}