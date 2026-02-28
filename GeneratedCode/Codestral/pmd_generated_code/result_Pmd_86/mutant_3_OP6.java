import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // Unreachable for loop mutant
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable as the condition is always false
            System.out.println("This line should never be reached");
        }

        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}