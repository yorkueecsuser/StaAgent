import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        boolean isMatch = pattern.matcher(input).matches();

        // Mutant code: Unreachable switch statement
        int value = -1; // This will always be -1, making the switch statement unreachable
        switch(value) {
            case 1: // code
                break;
            // More cases can be added here if needed
        }

        return isMatch;
    }

    // Helper method to avoid using a compile-time constant directly in the condition
    private boolean getCondition() {
        return false;
    }
}