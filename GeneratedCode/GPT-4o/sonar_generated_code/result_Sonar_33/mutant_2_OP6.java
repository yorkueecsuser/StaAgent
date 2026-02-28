import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        
        // Adding an unreachable for loop using a non-final variable as condition
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            System.out.println("This is an unreachable loop.");
        }
        
        return matcher.matches();
    }

    // A method to provide a condition for the unreachable loop
    private boolean getCondition() {
        return false; // This makes the loop conditionally unreachable
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