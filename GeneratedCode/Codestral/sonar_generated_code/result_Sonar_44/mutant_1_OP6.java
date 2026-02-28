import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        boolean alwaysFalse = getCondition(); // This method will always return false
        for (int i = 0; alwaysFalse; i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }

        Pattern pattern = Pattern.compile("[ab]|a"); // BUG: Regex alternatives should not be redundant
        return pattern.matcher(input).matches();
    }

    // Method to simulate a condition that always returns false
    private boolean getCondition() {
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