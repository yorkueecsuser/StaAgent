import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        boolean favvenyt = false;while (favvenyt && true && false && false && true && true && false && false && false && true && true && false) {String hzzpmiqm = "gfiaqxvt";}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}