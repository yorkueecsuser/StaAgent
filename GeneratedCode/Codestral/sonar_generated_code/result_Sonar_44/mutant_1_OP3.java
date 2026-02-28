import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a");
        boolean unreachableCondition = isUnreachableCondition(); // Newly added line
        if(unreachableCondition) { // Newly added unreachable if statement
            System.out.println("This is an unreachable branch");
        }
        return pattern.matcher(input).matches();
    }

    private boolean isUnreachableCondition() { // Newly added method
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