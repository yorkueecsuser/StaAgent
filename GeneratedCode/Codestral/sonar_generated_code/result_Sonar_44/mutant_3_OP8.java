import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String in) { // Mutation: Renamed 'input' to 'in'
        Pattern pattern = Pattern.compile("[ab]|a"); // BUG: Regex alternatives should not be redundant
        return pattern.matcher(in).matches();
    }

    public void showBug(String in) { // Mutation: Renamed 'input' to 'in'
        System.out.println("Input: " + in + ", Matches: " + checkRedundantAlternative(in));
    }

    public static void main(String[] args) {
        RedundantRegexAlternatives obj = new RedundantRegexAlternatives();
        obj.showBug("a");
        obj.showBug("b");
        obj.showBug("c");
    }
}