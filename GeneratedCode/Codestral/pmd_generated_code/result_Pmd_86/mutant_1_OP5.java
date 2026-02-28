import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static boolean alwaysFalse() {
        return false;
    }

    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        if (input.toLowerCase().equals("LIST")) {
            switch (alwaysFalse()) { // Unreachable switch statement
                case true:
                    // This code is unreachable
                    System.out.println("This code should not be executed.");
                    break;
            }
            return "Matched";
        }
        else {
            return "Not matched";
        }
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}