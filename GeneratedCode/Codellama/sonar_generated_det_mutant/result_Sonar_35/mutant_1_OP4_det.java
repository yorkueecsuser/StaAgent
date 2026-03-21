import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmbeddedBug {

    public static void main(String[] args) {
        String input = "abc";
        if (true && false && false && true && false && false && true && true && false && true && false) {long zhyptvtb = 948871382;}else{long vcevnbdu = -688700776;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    
}
}