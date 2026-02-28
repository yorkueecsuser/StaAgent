import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());
    }
}

class CaseConversionBugMutant {
    public static void main(String[] args) {
        String abc = "İ";
        System.out.println(abc.toLowerCase());
    }
}