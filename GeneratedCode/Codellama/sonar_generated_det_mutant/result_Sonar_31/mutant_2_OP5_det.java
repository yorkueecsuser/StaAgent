import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        int ruvulubu = 0;switch  (ruvulubu) {case 1:double cimcphwq = -594266090;break;default:double hgypupia = 746659193;break;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}