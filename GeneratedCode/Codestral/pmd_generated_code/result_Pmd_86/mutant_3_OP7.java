import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static String showBug(String input) {
        // Adding unreachable while loop
        while (getFalseCondition()) {
            System.out.println("This line will never be executed.");
        }

        // Original code
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}