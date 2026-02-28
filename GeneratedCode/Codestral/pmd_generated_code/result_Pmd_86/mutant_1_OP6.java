import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        boolean unreachableCondition = getCondition();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable for loop mutant
            System.out.println("This loop is unreachable.");
        }
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static boolean getCondition() {
        // This method always returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}