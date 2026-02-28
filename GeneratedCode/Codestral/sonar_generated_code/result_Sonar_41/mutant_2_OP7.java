import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(String input) {
        while(getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code will never execute.");
        }

        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(input).matches();
    }
}