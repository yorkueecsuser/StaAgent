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

        // Mutant: Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never be executed
            return "Unreachable block";
        } else {
            // This block should also never be executed
            return "Another unreachable block";
        }
    }

    public String showBug2() {
        Pattern pattern2 = Pattern.compile("\\d*+[02468]"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher2 = pattern2.matcher("1234");
        if (matcher2.find()) {
            return matcher2.group();
        }
        return "No match found";

        // Mutant: Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never be executed
            return "Unreachable block";
        } else {
            // This block should also never be executed
            return "Another unreachable block";
        }
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically
    }
}