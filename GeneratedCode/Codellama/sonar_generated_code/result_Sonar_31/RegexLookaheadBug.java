import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());

        // Mutant code starts
        boolean conditionFor = getCondition();
        while (conditionFor) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        // Mutant code ends
    }

    private static boolean getCondition() {
        // This method returns a non-final variable or an equivalent method call
        return false;
    }
}