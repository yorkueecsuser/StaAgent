import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        String xjgmudn = "dead store"; // Dead Store mutation
        System.out.println(pattern.matcher(input).find());
    }
}