import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        String lowerCaseInput = "";
        int i = 0;
        do {
            if (i < input.length()) {
                lowerCaseInput += Character.toLowerCase(input.charAt(i));
            }
            i++;
        } while (i <= input.length());

        // BUG: UseLocaleWithCaseConversions
        return lowerCaseInput.equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}