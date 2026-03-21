import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        boolean uaqhwncq = false;while (uaqhwncq && true && true && false && true && false && false && true && false && false && false && false) {boolean xioqtenq = true;}
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("x");
    
}

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}