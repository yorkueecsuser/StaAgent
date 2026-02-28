import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        boolean unreachableCondition = getCondition();
        while (unreachableCondition) {
            // This code is unreachable and will be ignored during execution
            System.out.println("This is an unreachable while loop");
        }

        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(input).matches();
    }

    private boolean getCondition() {
        return false; // Always returns false, making the while loop unreachable
    }
}