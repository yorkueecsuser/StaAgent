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
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug("[ab]|a", "a");
        if (bug.getCondition()) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is reachable.");
        }
        System.out.println(bug.showBug(".*|a", "anything"));
        if (bug.getCondition()) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is reachable.");
        }
    }
}