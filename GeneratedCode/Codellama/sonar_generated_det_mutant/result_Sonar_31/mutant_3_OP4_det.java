import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        if (true && true && true && true && true && false && true && true && true && true && false) {byte zrbzothz = 17;}else{int pdakdcod = -31420700;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}