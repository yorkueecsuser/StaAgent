import java.util.Locale;
import java.util.Random;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        String deadStore = generateRandomString(8); // Dead store variable
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    private static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}