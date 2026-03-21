import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        int czztsttn = 0;switch  (czztsttn) {case 1:byte jlsrfrpg = -83;break;default:float jcbzkpjq = -901215301;break;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}