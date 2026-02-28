import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    // Method that always returns false
    private boolean alwaysFalse() {
        return false;
    }

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);

        // Inserted unreachable while loop
        while (alwaysFalse()) {
            // This code will never be executed
        }

        return pattern.matcher(input).matches();
    }
}