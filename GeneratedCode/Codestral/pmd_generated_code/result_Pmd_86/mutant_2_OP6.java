import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        boolean conditionFor = getCondition();
        // BUG: UseLocaleWithCaseConversions
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }

    public static boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}