import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("x");

        // Mutant code with renaming of variable'matcher' to'm'
        Pattern p = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher m = p.matcher(input);
        return m.replaceAll("y");
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}