import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        if (true && false && false && false && true && true && true && false && true && false && false) {String mjsurvkq = "vubjiphi";}else{double ubstency = 47884251;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}