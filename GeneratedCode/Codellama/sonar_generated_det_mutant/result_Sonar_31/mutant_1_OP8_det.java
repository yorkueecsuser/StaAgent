import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String ozstzzxi = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(ozstzzxi).find());
    }
}