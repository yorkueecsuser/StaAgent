import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        // Introduced an unreachable while loop as per the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never execute because conditionWhile is always false
            System.out.println("This loop will never run");
        }

        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    }

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}