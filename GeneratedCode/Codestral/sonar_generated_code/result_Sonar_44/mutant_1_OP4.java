import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a");
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Reachable code
            return pattern.matcher(input).matches();
        } else {
            // Unreachable code inserted for the mutation
            System.out.println("This code should never be executed");
            return false;
        }
    }

    public boolean getCondition() {
        // Replace with actual dynamic condition
        return false;
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