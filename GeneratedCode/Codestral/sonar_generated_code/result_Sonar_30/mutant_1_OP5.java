import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");

        // Mutant: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                // Do nothing
        }

        return matcher.find()? "Match found" : "Match not found";
    }

    private int getUnreachableValue() {
        // This method will always return a value that won't match any case in the switch statement
        return -1;
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}