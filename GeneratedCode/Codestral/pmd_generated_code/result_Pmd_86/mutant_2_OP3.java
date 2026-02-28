import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    // Method to return a condition that is always false, simulating unreachable code
    private static boolean getFalseCondition() {
        return false;
    }

    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        if (getFalseCondition()) {
            return "Unreachable code executed"; // Unreachable code added here
        }
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}