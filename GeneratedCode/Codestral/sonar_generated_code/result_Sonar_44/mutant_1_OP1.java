import java.util.regex.Pattern;
import java.util.Random;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a"); // BUG: Regex alternatives should not be redundant
        // Adding dead store mutant
        int unusedVariable = new Random().nextInt(100);
        return pattern.matcher(input).matches();
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