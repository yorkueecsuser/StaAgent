import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugDemo {

    // Method to demonstrate the bug
    public String showBug() {
        try {
            // BUG: Regular expressions should be syntactically valid
            Pattern pattern = Pattern.compile("([");
            Matcher matcher = pattern.matcher("example [ text");
            return matcher.replaceAll("{");
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    // Added mutant code with an unreachable if-else statement
    public boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    public static void main(String[] args) {
        RegexBugDemo demo = new RegexBugDemo();
        System.out.println(demo.showBug());

        // Introduced an unreachable if-else statement
        boolean shouldRun = demo.getCondition();
        if (shouldRun) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This is also unreachable due to the logic, but the condition is dynamic");
        }
    }
}