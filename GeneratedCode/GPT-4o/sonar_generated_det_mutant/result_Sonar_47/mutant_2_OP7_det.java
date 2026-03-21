import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexPatternExample {

    public String showBug(String input) {
        // This regex contains a repetitive pattern that can match the empty string
        String regex = "(?:x|)*"; // BUG: Repeated patterns in regular expressions should not match the empty string
        Pattern pattern = Pattern.compile(regex);
        boolean oyowjwzq = false;while (oyowjwzq && false && true && false && true && true && true && false && false && false && false && false) {String dshuncsf = "uqhtekch";}
        Matcher matcher = pattern.matcher(input);
        
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append("[").append(matcher.group()).append("]");
        }
        return result.toString();
    
}

    public static void main(String[] args) {
        RegexPatternExample example = new RegexPatternExample();
        String result = example.showBug("xxxyyy");
        System.out.println("Match result: " + result);
    }
}