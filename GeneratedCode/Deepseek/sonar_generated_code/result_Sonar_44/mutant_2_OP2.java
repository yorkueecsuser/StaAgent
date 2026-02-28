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

        // Mutated Code: Duplication Operator
        if (matcher.find()) {
            return matcher.group();
        }
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        System.out.println(bug.showBug("[ab]|a", "a")); 
        System.out.println(bug.showBug(".*|a", "anything")); 
    }
}