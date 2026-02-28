import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());

        // Mutated code starts here
        String str2 = "i";
        System.out.println(str2.toUpperCase());
        // Mutated code ends here
    }
}