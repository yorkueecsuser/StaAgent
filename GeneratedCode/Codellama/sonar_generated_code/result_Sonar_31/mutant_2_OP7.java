import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    }
}

// Mutated code below
class RegexLookaheadBugMutant {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        boolean flag = false;
        while (flag) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        System.out.println(pattern.matcher(input).find());
    }
}