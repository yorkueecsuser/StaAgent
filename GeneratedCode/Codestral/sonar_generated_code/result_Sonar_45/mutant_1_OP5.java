import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("^a|b|c$");

        // Adding unreachable switch statement using a constant condition that always evaluates to false
        final boolean isFalse = false;
        int value = 0;
        if (isFalse) {
            switch (value) {
                case 1:
                    // Unreachable code
                    break;
                default:
                    break;
            }
        }

        return pattern.matcher(input).matches();
    }
}