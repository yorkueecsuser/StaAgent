import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("x");

        // Mutated code
        Pattern a = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher b = a.matcher(input);
        return b.replaceAll("x");
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));

        // Mutated code
        RegexExample c = new RegexExample();
        System.out.println(c.showBug("example"));
    }
}