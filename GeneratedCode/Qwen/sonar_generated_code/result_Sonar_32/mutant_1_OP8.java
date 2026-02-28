import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBackReferenceBug {

    // Method to demonstrate the bug with numeric back reference
    public String showBug1() {
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";

        // Mutant code
        Pattern x = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher y = x.matcher("ab");
        if (y.find()) {
            return y.group();
        }
        return "No match";
    }

    // Method to demonstrate the bug with undefined numeric back reference
    public String showBug2() {
        Pattern pattern = Pattern.compile("(.)\\2"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";

        // Mutant code
        Pattern a = Pattern.compile("(.)\\2"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher b = a.matcher("ab");
        if (b.find()) {
            return b.group();
        }
        return "No match";
    }

    // Method to demonstrate the bug with back reference in different branches
    public String showBug3() {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";

        // Mutant code
        Pattern c = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher d = c.matcher("ab");
        if (d.find()) {
            return d.group();
        }
        return "No match";
    }

    // Method to demonstrate the bug with named back reference in different branches
    public String showBug4() {
        Pattern pattern = Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";

        // Mutant code
        Pattern e = Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher f = e.matcher("ab");
        if (f.find()) {
            return f.group();
        }
        return "No match";
    }
}