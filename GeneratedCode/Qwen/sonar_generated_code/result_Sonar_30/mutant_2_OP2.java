import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    public String showBug1() {
        Pattern pattern = Pattern.compile("\\ca"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Pattern patternDuplicate = Pattern.compile("\\ca"); // Mutant: Duplicate assignment
        Matcher matcher = pattern.matcher("a");
        return matcher.find()? "Match found" : "No match";
    }

    public String showBug2() {
        Pattern pattern = Pattern.compile("\\c!"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Pattern patternDuplicate = Pattern.compile("\\c!"); // Mutant: Duplicate assignment
        Matcher matcher = pattern.matcher("!");
        return matcher.find()? "Match found" : "No match";
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1());
        System.out.println(example.showBug2());
    }
}