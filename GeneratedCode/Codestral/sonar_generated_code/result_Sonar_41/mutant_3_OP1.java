import java.util.regex.Pattern;
import java.util.Random;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSENSITIVE | Pattern.UNICODE_CASE); // UNICODE_CASE flag added for proper case insensitivity

        // Dead Store: Adding an unused integer variable
        int deadVariable = new Random().nextInt(100);

        return pattern.matcher(input).matches();
    }
}