import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a"); // BUG: Regex alternatives should not be redundant
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // original code
            return pattern.matcher(input).matches();
        } else {
            // unreachable code
            System.out.println("This code should never run.");
            return false;
        }
    }

    public void showBug(String input) {
        System.out.println("Input: " + input + ", Matches: " + checkRedundantAlternative(input));
    }

    public static void main(String[] args) {
        RedundantRegexAlternatives obj = new RedundantRegexAlternatives();
        obj.showBug("a");
        obj.showBug("b");
        obj.showBug("c");
    }

    // Dummy method to ensure code compiles
    private static boolean getCondition() {
        return true;
    }
}