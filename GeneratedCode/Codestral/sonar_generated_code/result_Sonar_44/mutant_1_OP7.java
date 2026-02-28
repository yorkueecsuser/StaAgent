import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a");

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block of code is unreachable
            System.out.println("Unreachable code executed!");
        }

        return pattern.matcher(input).matches();
    }

    public boolean getCondition() {
        return false; // Always return false to make the loop unreachable
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
}