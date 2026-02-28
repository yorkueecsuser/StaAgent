import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        // Original code
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        boolean matchResult = pattern.matcher(input).matches();

        // Mutant code
        // Adding an unreachable switch statement with a condition that always evaluates to false
        boolean switchCondition = false;
        if (switchCondition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // code that will never be reached
                    break;
            }
        }

        return matchResult;
    }

    // Method to return a value (needed to avoid compile-time errors)
    private int getValue() {
        return 0;
    }
}