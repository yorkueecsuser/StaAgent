import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        
        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This block is unreachable because unreachableValue is always 0
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default block does nothing
                break;
        }
        
        return matcher.matches();
    }

    private int getUnreachableValue() {
        return 0; // Returning 0 to ensure the case 1 is unreachable
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