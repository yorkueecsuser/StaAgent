import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);

        // Added mutant: Unreachable if statement
        boolean alwaysFalse = isAlwaysFalse();
        if (alwaysFalse) {
            System.out.println("This code will never execute!");
        }

        return pattern.matcher(input).matches();
    }

    // Method to dynamically determine if the condition is always false
    private boolean isAlwaysFalse() {
        return false;
    }
}