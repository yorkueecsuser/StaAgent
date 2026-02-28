import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    }
}

// Mutant 1: Duplicating the assignment statement for pattern
class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        Pattern pattern = Pattern.compile("(?=a)b"); // Mutant 1
        System.out.println(pattern.matcher(input).find());
    }
}

// Mutant 2: Duplicating the assignment statement for input
class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        String input = "a"; // Mutant 2
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    }
}