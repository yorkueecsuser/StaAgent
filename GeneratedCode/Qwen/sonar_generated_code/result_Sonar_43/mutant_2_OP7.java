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

    // Introduced an unreachable while loop as per mutation operator
    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBugDemo demo = new RegexBugDemo();
        System.out.println(demo.showBug());

        // Introduced an unreachable while loop
        boolean conditionWhile = demo.getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
            System.out.println("This will never be printed");
        }
    }
}