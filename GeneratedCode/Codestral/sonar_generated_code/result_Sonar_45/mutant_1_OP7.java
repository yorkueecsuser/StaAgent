import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable Code");
        }

        Pattern pattern = Pattern.compile("^a|b|c$");
        return pattern.matcher(input).matches();
    }

    // Method to return false always
    private boolean getCondition() {
        return false;
    }
}