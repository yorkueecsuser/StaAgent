import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());

        // Mutant 1: Duplicate the assignment statement for input
        String input = "a";

        // Mutant 2: Duplicate the assignment statement for pattern
        Pattern pattern = Pattern.compile("(?=a)b");
    }
}