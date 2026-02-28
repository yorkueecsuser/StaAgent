import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBugExample {

    public String showBug1() {
        Pattern pattern1 = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher1 = pattern1.matcher("aaaabc");
        if (matcher1.find()) {
            return matcher1.group();
        }
        return "No match found";

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never be executed
            return "Unreachable block in showBug1";
        } else {
            // Alternative block that is also unreachable due to the nature of the condition
            return "Another unreachable block in showBug1";
        }
    }

    public String showBug2() {
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher2 = pattern2.matcher("1234");
        if (matcher2.find()) {
            return matcher2.group();
        }
        return "No match found";

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never be executed
            return "Unreachable block in showBug2";
        } else {
            // Alternative block that is also unreachable due to the nature of the condition
            return "Another unreachable block in showBug2";
        }
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }
}