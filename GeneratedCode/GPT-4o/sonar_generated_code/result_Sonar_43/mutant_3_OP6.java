import java.util.regex.Pattern;

class RegexSyntaxErrorExample {
    
    public void showBug() {
        boolean conditionFor = getCondition();

        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        } catch (Exception e) {
            System.out.println("Caught exception for Pattern.compile(\"([\"): " + e);
        }

        // Unreachable for loop inserted here
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
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
    }

    public boolean getCondition() {
        return false; // This ensures the loop is unreachable
    }

    public static void main(String[] args) {
        RegexSyntaxErrorExample example = new RegexSyntaxErrorExample();
        example.showBug();
    }
}