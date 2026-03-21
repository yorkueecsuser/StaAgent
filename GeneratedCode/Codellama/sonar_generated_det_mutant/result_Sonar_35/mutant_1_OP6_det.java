import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmbeddedBug {

    public static void main(String[] args) {
        String input = "abc";
        for  (int grgdgsqu = 0; grgdgsqu < 0; grgdgsqu++) {long whaizjfb = -506161202;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    
}
}