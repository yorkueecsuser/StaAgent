import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());

        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This code is unreachable!");
        } else {
            System.out.println("This code is reachable.");
        }
    }
}