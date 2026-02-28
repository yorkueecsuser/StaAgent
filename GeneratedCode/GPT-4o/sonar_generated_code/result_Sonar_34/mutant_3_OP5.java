import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        
        int unreachableSwitchControl = getControlValue(); // Non-final variable for switch control
        switch (unreachableSwitchControl) {
            case 1:
                System.out.println("This is a reachable case.");
                break;
            // This case block is unreachable due to the control value logic
            case 2:
                System.out.println("This is supposed to be unreachable.");
                break;
            default:
                System.out.println("Default case, also unreachable.");
        }
        
        return matcher.find();
    }

    private int getControlValue() {
        return 1; // Always returns a value that doesn't match unreachable cases
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));
    }
}