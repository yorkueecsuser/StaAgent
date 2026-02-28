import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        String renamedInput = input;
        return renamedInput.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String renamedInput = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(renamedInput)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}