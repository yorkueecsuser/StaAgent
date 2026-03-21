import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String znjxuuyu = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(znjxuuyu)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}