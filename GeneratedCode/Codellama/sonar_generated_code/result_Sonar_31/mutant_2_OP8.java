import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    }
}

// Renamed variable "pattern" to "p"
class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern p = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(p.matcher(input).find());
    }
}