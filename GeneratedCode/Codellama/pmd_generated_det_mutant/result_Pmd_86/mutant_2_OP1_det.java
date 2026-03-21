import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        char acmwngbi = 's';
        String str = "İ";
        System.out.println(str.toLowerCase());
    
}
}