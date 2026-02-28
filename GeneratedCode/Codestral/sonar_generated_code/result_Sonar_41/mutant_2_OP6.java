import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // Fixed: Added UNICODE_CASE flag
        boolean shouldRun = getCondition(); // Method call to get dynamic condition
        if (shouldRun) {
            for (int i = 0; false; i++) { // Mutant: Inserted unreachable for loop
                System.out.println("This loop is unreachable");
            }
        }
        return pattern.matcher(input).matches();
    }

    private boolean getCondition() {
        return false; // Returns false to make the loop unreachable
    }
}