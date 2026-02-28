import java.util.regex.*;

class RegexBug {
    private boolean condition = true;

    public String showBug(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (condition) {
            if (matcher.find()) {
                return matcher.group();
            } else {
                return null;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        System.out.println(bug.showBug("[ab]|a", "a"));
        System.out.println(bug.showBug(".*|a", "anything"));
    }
}