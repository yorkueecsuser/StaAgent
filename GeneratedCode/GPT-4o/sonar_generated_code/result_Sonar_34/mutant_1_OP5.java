import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBugDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
        RegexBoundaryBugDemo demo = new RegexBoundaryBugDemo();
        System.out.println("Match found: " + demo.showBug("example"));

        // Adding an unreachable switch statement as per mutation operator requirements
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            case 2:
                System.out.println("This is also unreachable");
                break;
            default:
                System.out.println("Default case is unreachable too");
        }
    }

    // Method to simulate an unreachable value for switch statement
    private static int getUnreachableValue() {
        return 3; // Always returns a value that does not match any case
    }
}