import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());

        // Mutant code added below
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Unreachable branch executed!");
        } else {
            System.out.println("Reachable branch executed!");
        }
    }

    static boolean getCondition() {
        return false;
    }
}