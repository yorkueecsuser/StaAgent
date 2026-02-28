import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This line should never be executed");
        } else {
            // Original code
            return pattern.matcher(input).matches();
        }
    }

    // Method that always returns false
    private boolean getCondition() {
        return false;
    }
}