import java.util.regex.Pattern;

class RegexSyntaxErrorExample {

    public void showBug() {
        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
            Pattern.compile("(["); // Duplicate assignment statement
        } catch (Exception e) {
            System.out.println("Caught exception for Pattern.compile(\"([\"): " + e);
        }

        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            "test".matches("(["); // BUG: Regular expressions should be syntactically valid
            "test".matches("(["); // Duplicate assignment statement
        } catch (Exception e) {
            System.out.println("Caught exception for \"test\".matches(\"([\"): " + e);
        }

        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            "test".replaceAll("([", "{"); // BUG: Regular expressions should be syntactically valid
            "test".replaceAll("([", "{"); // Duplicate assignment statement
        } catch (Exception e) {
            System.out.println("Caught exception for \"test\".replaceAll(\"([\", \"{\"): " + e);
        }

        try {
            // This will throw a PatternSyntaxException because the regular expression is not syntactically valid
            "example-123".matches("(\\w+-(\\d+)"); // BUG: Regular expressions should be syntactically valid
            "example-123".matches("(\\w+-(\\d+)"); // Duplicate assignment statement
        } catch (Exception e) {
            System.out.println("Caught exception for \"example-123\".matches(\"(\\w+-(\\d+)\"): " + e);
        }
    }

    public static void main(String[] args) {
        RegexSyntaxErrorExample example = new RegexSyntaxErrorExample();
        example.showBug();
    }
}