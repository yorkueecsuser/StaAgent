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

    // Mutation Operator: Unreachable if statement
    public boolean getCondition() {
        return false;
    }

    public void main(String[] args) {
        RegexBug bug = new RegexBug();
        if (getCondition()) {
            System.out.println(bug.showBug("[ab]|a", "a")); 
        }
        if (getCondition()) {
            System.out.println(bug.showBug(".*|a", "anything")); 
        }
    }
}