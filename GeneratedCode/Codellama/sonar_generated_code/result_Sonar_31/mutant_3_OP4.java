import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());

        // Mutant code
        boolean shouldRun = getCondition();
        if (shouldRun) {
            Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
            System.out.println(pattern.matcher(input).find());
        } else {
            System.out.println("Unreachable code");
        }
    }
}