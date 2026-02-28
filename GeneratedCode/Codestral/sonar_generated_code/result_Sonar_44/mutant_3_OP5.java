import java.util.regex.Pattern;

class RedundantRegexAlternatives {
    public boolean checkRedundantAlternative(String input) {
        Pattern pattern = Pattern.compile("[ab]|a"); // BUG: Regex alternatives should not be redundant
        boolean isUnreachable = false;

        // Inserting unreachable switch statement
        switch (isUnreachable) {
            case true:
                System.out.println("This statement is unreachable");
                break;
        }

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