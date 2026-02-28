import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        
        // Inserted unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1001:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
        
        return matcher.matches();
    }

    // Helper method to ensure the switch condition is not a compile-time constant
    private int getUnreachableValue() {
        return -1; // This value does not match any case in the switch statement
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