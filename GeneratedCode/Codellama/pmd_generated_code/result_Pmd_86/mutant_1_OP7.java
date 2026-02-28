import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());
        while(false) {
            // unreachable code
            System.out.println("This code is unreachable");
        }
    }
}