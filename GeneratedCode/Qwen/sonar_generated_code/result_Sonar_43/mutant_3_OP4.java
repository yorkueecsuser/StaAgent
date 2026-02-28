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
        } finally {
            // Inserting an unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block should never execute
                System.out.println("This is an unreachable block");
            } else {
                // Alternative block that should also never execute
                System.out.println("This is another unreachable block");
            }
        }
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBugDemo demo = new RegexBugDemo();
        System.out.println(demo.showBug());
    }
}