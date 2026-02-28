import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());

        // Mutation Operator: Unreachable for loop
        // Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable code
        }
    }
}