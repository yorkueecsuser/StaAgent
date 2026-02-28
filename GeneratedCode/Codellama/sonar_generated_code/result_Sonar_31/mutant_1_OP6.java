import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());

        // Unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
            System.out.println("This statement is unreachable.");
        }
    }

    private static boolean getConditionFor() {
        return false;
    }
}