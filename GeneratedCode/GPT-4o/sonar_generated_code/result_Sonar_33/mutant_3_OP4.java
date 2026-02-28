import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);

        // Inserting unreachable if-else statement
        boolean unreachableCondition = getCondition(); // Method that returns false
        if (unreachableCondition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the reachable part of the unreachable if-else statement.");
        }

        return matcher.matches();
    }

    // Method to ensure the if-else statement is unreachable
    private boolean getCondition() {
        return false; // Always returns false
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