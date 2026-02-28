import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    }

    // Mutant 1: Unreachable while loop
    private static void mutant1() {
        boolean condition = true;
        while (condition) {
            // Unreachable code
            System.out.println("This code should not be executed");
        }
    }
}