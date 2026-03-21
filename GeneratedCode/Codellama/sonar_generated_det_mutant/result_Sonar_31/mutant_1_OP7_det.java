import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        boolean fqrwscto = false;while (fqrwscto && false && false && true && false && false && false && false && true && false && true && false) {byte zfgbjqid = -103;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}