import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        if (getUnreachableCondition()) {
            // Unreachable mutant code
            throw new RuntimeException("This code should not be executed");
        }
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    private static boolean getUnreachableCondition() {
        return false;   // This will always return false
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}