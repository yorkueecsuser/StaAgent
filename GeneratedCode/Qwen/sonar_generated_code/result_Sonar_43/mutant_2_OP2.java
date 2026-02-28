import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugDemo {

    // Method to demonstrate the bug
    public String showBug() {
        try {
            // BUG: Regular expressions should be syntactically valid
            Pattern pattern = Pattern.compile("([");
            Pattern patternDuplicate = Pattern.compile("(["); // Duplicate assignment
            Matcher matcher = pattern.matcher("example [ text");
            Matcher matcherDuplicate = pattern.matcher("example [ text"); // Duplicate assignment
            return matcher.replaceAll("{");
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        RegexBugDemo demo = new RegexBugDemo();
        System.out.println(demo.showBug());
    }
}