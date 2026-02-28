import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher matcher = pattern.matcher(input);
        
        // Introduced an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            System.out.println("This is an unreachable block.");
        } else {
            // This block will always execute
            System.out.println("This block will execute.");
        }
        
        return matcher.replaceAll("x");
    }

    private boolean getCondition() {
        // Always returns false, making the 'if' block unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}