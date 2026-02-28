import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        String lowerCaseInput = input.toLowerCase();
        String result = lowerCaseInput.equals("LIST")? "Matched" : "Not matched";
        // Mutation: Duplication of the assignment statement
        String duplicatedLowerCaseInput = input.toLowerCase();
        return result;
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}