import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        boolean dcnrmndz = false;while (dcnrmndz && false && true && false && false && true && false && false && false && true && true && false) {short lutnmtas = 3562;}
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("x");
    
}

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}