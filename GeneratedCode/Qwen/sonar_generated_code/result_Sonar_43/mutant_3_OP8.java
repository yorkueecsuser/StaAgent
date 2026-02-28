import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugDemo {

    // Method to demonstrate the bug
    public String showBug() {
        try {
            // BUG: Regular expressions should be syntactically valid
            Pattern pattern = Pattern.compile("([");
            Matcher matcher = pattern.matcher("example [ text");
            return matcher.replaceAll("{");
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        RegexBugDemo demo = new RegexBugDemo();
        System.out.println(demo.showBug());

        // Mutant code with renaming variable 'pattern' to 'x'
        try {
            Pattern x = Pattern.compile("([");
            Matcher matcher2 = x.matcher("example [ text");
            return matcher2.replaceAll("{");
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}