import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a"); // Original statement
        Pattern patternDuplicate = Pattern.compile("[ab]|a"); // Mutated statement: Duplication of the original statement
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