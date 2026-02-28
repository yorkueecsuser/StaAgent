import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);

        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable because condition is always false
            System.out.println("Unreachable if-else branch executed!");
        } else {
            // This is the else branch which will always execute
            System.out.println("Else branch executed!");
        }

        return matcher.matches();
    }

    // Simulates a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexStackOverflowDemo demo = new RegexStackOverflowDemo();
        
        // This input is intentionally long to demonstrate the stack overflow
        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < 7000; i++) {
            inputBuilder.append("a");
        }
        String input = inputBuilder.toString();

        // This call may cause a stack overflow due to the bug in the regex
        boolean result = demo.showBug(input);
        System.out.println("Matching result: " + result);
    }
}