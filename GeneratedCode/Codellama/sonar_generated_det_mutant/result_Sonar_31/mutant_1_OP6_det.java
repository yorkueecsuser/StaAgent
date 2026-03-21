import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        for  (int jpcfmkkb = 0; jpcfmkkb < 0; jpcfmkkb++) {String qawazupl = "fjovvmuy";}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}