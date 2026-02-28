import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        
        // Mutant: Introduce an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is intentionally unreachable
            System.out.println("This statement is unreachable.");
        }

        return matcher.matches();
    }
    
    private boolean getUnreachableCondition() {
        return false; // Dynamic determination to simulate unreachable code
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