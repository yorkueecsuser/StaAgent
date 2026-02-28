import java.util.regex.Pattern;
import java.util.regex.Matcher;

class BuggyRegex {
    private static boolean getFalseCondition() {
        return false;
    }

    public String showBug(String input) {
        Pattern pattern = Pattern.compile("\\c" + input);
        Matcher matcher = pattern.matcher("Example string");

        // Unreachable switch statement
        int value = 0;
        if (getFalseCondition()) {
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("This is an unreachable statement");
                    break;
            }
        }

        return matcher.find()? "Match found" : "Match not found";
    }

    public static void main(String[] args) {
        BuggyRegex buggyRegex = new BuggyRegex();
        System.out.println(buggyRegex.showBug("a"));
        System.out.println(buggyRegex.showBug("!"));
    }
}