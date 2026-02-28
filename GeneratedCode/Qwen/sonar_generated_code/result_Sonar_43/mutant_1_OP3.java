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

    // Added mutant code with an unreachable if statement
    public void mutantMethod() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable block");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBugDemo demo = new RegexBugDemo();
        System.out.println(demo.showBug());
        demo.mutantMethod(); // Call to the mutant method
    }
}