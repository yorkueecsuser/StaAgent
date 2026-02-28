import java.util.regex.Pattern;

class RegularExpressionBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String input) {
        // Original code
        Pattern pattern = Pattern.compile("^a|b|c$");
        boolean matches = pattern.matcher(input).matches();

        // Mutation: Inserting unreachable while loop
        while (getFalseCondition()) {
            // This code will never be executed
            System.out.println("Unreachable while loop");
        }

        return matches;
    }
}