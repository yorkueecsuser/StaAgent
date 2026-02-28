import java.util.regex.*;

class RegexBug {

    public String showBug(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }

        // Mutation Operator: Unreachable while loop
        boolean unreachableLoop = false; // Mutation Operator: Using non-final variable instead of compile-time constant
        while (unreachableLoop) { // Mutation Operator: Using non-final variable instead of compile-time constant
            // This loop is unreachable
        }
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        System.out.println(bug.showBug("[ab]|a", "a")); // BUG: Regex alternatives should not be redundant
        System.out.println(bug.showBug(".*|a", "anything")); // BUG: Regex alternatives should not be redundant
    }
}