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

        // Adding an unreachable if-else branch
        boolean condition = getCondition(); // This method can return false, making the if statement's block unreachable
        if (condition) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This is the else block.");
        }
    }

    // A method that returns false to simulate an unreachable if-else branch
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexSyntaxErrorExample example = new RegexSyntaxErrorExample();
        example.showBug();
    }
}