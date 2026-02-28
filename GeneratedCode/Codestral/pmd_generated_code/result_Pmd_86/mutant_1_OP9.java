import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        // Original code: return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
        // Mutated code: Intentionally using system-dependent conversion (Turkish locale)
        return input.toLowerCase(new Locale("tr", "TR")).equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Not matched" in a Turkish locale, as desired
    }
}