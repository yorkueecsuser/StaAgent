import java.util.regex.Pattern;

class RegularExpressionBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String input) {
        // Inserted unreachable if branch
        if (getFalseCondition()) {
            throw new RuntimeException("This branch should not be reachable");
        }

        Pattern pattern = Pattern.compile("^a|b|c$");
        return pattern.matcher(input).matches();
    }
}