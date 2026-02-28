import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // Original code
        String result = input.toLowerCase().equals("LIST")? "Matched" : "Not matched";

        // Mutant code: Unreachable if statement
        if (isUnreachableCondition()) {
            // This block of code is unreachable
            int unused = 10 / 0;
        }

        return result;
    }

    private static boolean isUnreachableCondition() {
        // Always return false to make the condition unreachable
        return false;
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}