import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Pattern patternCopy = Pattern.compile("["); // Mutant: Duplicated assignment statement
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("x");
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}