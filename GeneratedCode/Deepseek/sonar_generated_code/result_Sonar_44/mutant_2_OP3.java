import java.util.regex.*;

class RegexBug {

    public String showBug(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean condition = false; // Mutation: Inserting unreachable if branch
        if (condition) { // Mutation: Always false condition
            return matcher.group();
        } else {
            // Mutation: Unreachable else statement
            return null;
        }
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        System.out.println(bug.showBug("[ab]|a", "a"));
        System.out.println(bug.showBug(".*|a", "anything"));
    }
}