import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        // Original code
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);

        // Mutated code (Unreachable if statement)
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            int x = 1 / 0; // This line will never be executed due to the condition being false
        }

        return pattern.matcher(input).matches();
    }

    private boolean getUnreachableCondition() {
        return false; // This condition is always false, making the if statement unreachable
    }
}