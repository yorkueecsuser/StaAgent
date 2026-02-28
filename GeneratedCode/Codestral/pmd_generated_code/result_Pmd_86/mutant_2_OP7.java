import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static boolean getCondition() {
        return false;
    }

    public static String showBug(String input) {
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop");
        }

        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}