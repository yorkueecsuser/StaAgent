import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        int kuewfava = 0;switch  (kuewfava) {case 1:int yrnvflau = 696262067;break;default:float wqlaiduq = 216229738;break;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}