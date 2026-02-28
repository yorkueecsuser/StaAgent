import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {
    public static void main(String[] args) {
        RegexBugExample rbe = new RegexBugExample();
        rbe.showBug();
    }

    public String showBug() {
        String nonCompliantPattern = "$[a-z]+^"; // BUG: Regex boundaries should not be used in a way that can never be matched
        Pattern pattern = Pattern.compile(nonCompliantPattern);
        Matcher matcher = pattern.matcher("test");
        if (matcher.find()) {
            return matcher.group();
        }

        // Unreachable switch statement with constant value
        boolean shouldRun = getCondition();
        if (shouldRun) {
            switch (0) {
                case 1:
                    System.out.println("This line of code will not be executed");
                    break;
            }
        }

        return null;
    }

    // Method to return a constant value
    public boolean getCondition() {
        return false;
    }
}