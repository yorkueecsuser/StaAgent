import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        // Unreachable for loop mutant
        for (int i = 0; getFalseCondition(); i++) {
            // This code will never be executed
        }

        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // Added UNICODE_CASE flag as per the bug fix
        return pattern.matcher(input).matches();
    }

    private boolean getFalseCondition() {
        return false;
    }
}