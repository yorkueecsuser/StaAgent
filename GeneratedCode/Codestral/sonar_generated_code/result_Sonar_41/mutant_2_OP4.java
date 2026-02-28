import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        boolean unreachableCondition = isUnreachableCondition(); // Create a dynamic condition that is always false
        if (unreachableCondition) {
            // Unreachable branch
            System.out.println("This is an unreachable branch.");
        } else {
            // Original branch
            return pattern.matcher(input).matches();
        }
    }

    // Method to return a dynamic condition that is always false
    private boolean isUnreachableCondition() {
        return false;
    }
}