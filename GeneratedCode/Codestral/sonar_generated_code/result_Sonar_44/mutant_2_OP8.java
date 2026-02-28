import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern p = Pattern.compile("[ab]|a"); // BUG: Regex alternatives should not be redundant
        return p.matcher(input).matches();
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