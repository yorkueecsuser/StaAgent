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

        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 123456: // This case will never be hit
                System.out.println("This is unreachable code in switch statement.");
                break;
            default:
                // Do nothing
                break;
        }
    }
    
    private int getUnreachableValue() {
        // Ensure this method returns a value that doesn't match the switch case
        return 0; // This will never match the case 123456
    }

    public static void main(String[] args) {
        RegexSyntaxErrorExample example = new RegexSyntaxErrorExample();
        example.showBug();
    }
}