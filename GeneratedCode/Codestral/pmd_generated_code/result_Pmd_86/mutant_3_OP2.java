import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        String lowercaseInput = input.toLowerCase(); // Duplicating the assignment
        return lowercaseInput.equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
        System.out.println(input); // Added to verify the duplicated assignment does not have side effects
    }
}