import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher matcher = pattern.matcher(input);
        
        // Introduced an unreachable if statement with a dynamic condition
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable because getUnreachableCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
        
        return matcher.replaceAll("x");
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}