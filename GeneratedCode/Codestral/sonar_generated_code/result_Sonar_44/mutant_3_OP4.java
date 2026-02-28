import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a");
        if (unreachableCondition()) {
            // Unreachable if-else statement mutation
            System.out.println("Unreachable branch executed");
        } else {
            System.out.println("Alternative branch executed");
        }
        return pattern.matcher(input).matches();
    }

    private boolean unreachableCondition() {
        // This condition is always false to make the if-else statement unreachable
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