import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
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

        // Introducing an unreachable switch statement
        int switchValue = getSwitchValue();
        switch (switchValue) {
            case 1:
                System.out.println("This won't be printed.");
                break;
            default:
                // Intentionally left empty as this is an unreachable block
                break;
        }
    }

    // Helper method to ensure the switchValue is always out of case bounds
    public static int getSwitchValue() {
        return 0; // This can be any value that is not a case label
    }
}