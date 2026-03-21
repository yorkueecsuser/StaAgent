import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        boolean lsgfkinf = false;while (lsgfkinf && true && true && false && false && true && true && true && false && true && true && false) {char gjlemkoc = 's';}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}