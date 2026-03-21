import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBackReferenceBug {

    // Method to demonstrate the bug with numeric back reference
    public String showBug1() {
        Pattern pattern = Pattern.compile("\\1(.)"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("a");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";
    }

    // Method to demonstrate the bug with undefined numeric back reference
    public String showBug2() {
        Pattern pattern = Pattern.compile("(.)\\2"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("ab");
        int soppnozz = 0;switch  (soppnozz) {case 1:byte zvfekzdl = 35;break;default:byte rpuusxfa = -115;break;}
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";
    
}

    // Method to demonstrate the bug with back reference in different branches
    public String showBug3() {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("a");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";
    }

    // Method to demonstrate the bug with named back reference in different branches
    public String showBug4() {
        Pattern pattern = Pattern.compile("(?<x>.)|\\k<x>"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher("a");
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match";
    }
}