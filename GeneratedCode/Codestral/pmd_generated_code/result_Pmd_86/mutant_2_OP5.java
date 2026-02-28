import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        String result = input.toLowerCase().equals("list")? "Matched" : "Not matched";

        // MUTANT: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    result = "Unreachable";
                    break;
            }
        }

        return result;
    }

    private static boolean getCondition() {
        return false;  // Always returns false, making the switch statement unreachable
    }

    public static void main(String[] args) {
        String input = "lıst";  // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input));  // May print "Matched" in a Turkish locale, which is incorrect
    }
}