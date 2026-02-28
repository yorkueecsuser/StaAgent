import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        String lowerCaseInput = input.toLowerCase();
        String lowerCaseInputDuplicate = lowerCaseInput; // Mutant: Duplicate the assignment statement
        return lowerCaseInputDuplicate.equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}