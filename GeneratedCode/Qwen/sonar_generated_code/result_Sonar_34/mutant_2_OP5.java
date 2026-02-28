import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBoundaryBug {

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case");
                break;
            default:
                // This is the only reachable case
                System.out.println("This is the reachable default case");
                break;
        }
        
        return "No match found";
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));
    }
}