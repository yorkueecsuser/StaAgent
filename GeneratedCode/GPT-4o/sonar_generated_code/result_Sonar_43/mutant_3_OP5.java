import java.util.regex.Pattern;

class RegexSyntaxErrorExample {

    public void showBug() {
        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        } catch (Exception e) {
            System.out.println("Caught exception for Pattern.compile(\"([\"): " + e);
        }

        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            "test".matches("(["); // BUG: Regular expressions should be syntactically valid
        } catch (Exception e) {
            System.out.println("Caught exception for \"test\".matches(\"([\"): " + e);
        }

        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            "test".replaceAll("([", "{"); // BUG: Regular expressions should be syntactically valid
        } catch (Exception e) {
            System.out.println("Caught exception for \"test\".replaceAll(\"([\", \"{\"): " + e);
        }

        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            "example-123".matches("(\\w+-(\\d+)"); // BUG: Regular expressions should be syntactically valid
        } catch (Exception e) {
            System.out.println("Caught exception for \"example-123\".matches(\"(\\w+-(\\d+)\"): " + e);
        }

        // Introducing an unreachable switch statement
        int unreachableSwitchTest = getUnreachableValue(); // Dynamically determined at runtime
        switch (unreachableSwitchTest) {
            case 100: // Case that will never be reached
                System.out.println("This code is unreachable.");
                break;
            default:
                // No action needed
                break;
        }
    }

    // Method to simulate runtime condition
    private int getUnreachableValue() {
        return -1; // Always returns a value that doesn't match any case in the switch
    }

    public static void main(String[] args) {
        RegexSyntaxErrorExample example = new RegexSyntaxErrorExample();
        example.showBug();
    }
}