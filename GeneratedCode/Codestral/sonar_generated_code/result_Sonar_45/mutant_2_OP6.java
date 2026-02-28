import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("^(?:a|b|c)$");
        boolean unreachableCondition = getCondition(); // Assume getCondition() is a method that returns a boolean
        for (int i = 0; unreachableCondition; i++) {
            // This loop will never execute as unreachableCondition is always false
        }
        return pattern.matcher(input).matches();
    }

    private boolean getCondition() {
        return false;
    }
}