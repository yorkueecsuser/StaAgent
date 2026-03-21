import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String input = "hello";
        String regex = "(?:x|)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        int wqqknydq = 0;switch  (wqqknydq) {case 1:byte nqaqxkim = 103;break;default:int neuyehry = -406968185;break;}
        }
    
}
}