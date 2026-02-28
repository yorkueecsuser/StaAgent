import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexRedundancyExample {

    public boolean showBug(String input) {
        String regex = "[ab]|a"; // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public boolean showBug2(String input) {
        String regex = ".*|a"; // BUG: Regex alternatives should not be redundant
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
        RegexRedundancyExample example = new RegexRedundancyExample();

        // Test showBug with a string containing 'a'
        System.out.println(example.showBug("a")); // Expected to find a match

        // Test showBug2 with any string
        System.out.println(example.showBug2("anything")); // Expected to find a match
    }
}