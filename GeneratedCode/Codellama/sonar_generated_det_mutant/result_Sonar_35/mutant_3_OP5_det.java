import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmbeddedBug {

    public static void main(String[] args) {
        String input = "abc";
        int axitihip = 0;switch  (axitihip) {case 1:char lguanwuy = 'z';break;default:boolean zhkddzzn = true;break;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    
}
}