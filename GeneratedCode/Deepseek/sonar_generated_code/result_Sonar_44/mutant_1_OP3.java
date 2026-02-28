import java.util.regex.*;

class RegexBug {
    private boolean result;

    public RegexBug(boolean result) {
        this.result = result;
    }

    public String showBug(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group();
        } else {
            if (result) {
              return null; // This part is the mutation
            } else {
              return "Unreachable"; // This part is the mutation
            }
        }
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug(false);
        System.out.println(bug.showBug("[ab]|a", "a"));
        System.out.println(bug.showBug(".*|a", "anything"));
    }
}