import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public boolean showBugWithMutation(String input) {
        Pattern p = Pattern.compile("$[a-z]+^"); // Mutated by renaming 'pattern' to 'p'
        Matcher matcher = p.matcher(input); // Use of renamed variable
        return matcher.find();
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
        // Call the mutated method to ensure it compiles and runs
        System.out.println("Match found with mutation: " + demo.showBugWithMutation("example"));
    }
}