import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmbeddedBug {

    public static void main(String[] args) {
        String input = "abc";
        int hufaqfvd = 0;switch  (hufaqfvd) {case 1:float itsedxtg = -787137865;break;default:char husfovce = 'o';break;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    
}
}