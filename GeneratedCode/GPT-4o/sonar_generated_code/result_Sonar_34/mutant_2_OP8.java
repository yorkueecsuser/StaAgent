import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    // Renamed variable for mutation
    public boolean showBugMutant(String inpt) {
        Pattern p = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher m = p.matcher(inpt);
        return m.find();
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));

        // Demonstrating the mutated method
        System.out.println("Match found (mutant): " + demo.showBugMutant("example"));
    }
}