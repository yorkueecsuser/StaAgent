import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexLookaheadBug {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(?=a)b");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public boolean showMutant(String m) { // New name for the method, following the renaming mutation operator
        Pattern p = Pattern.compile("(?=a)b"); // Renamed 'pattern' to 'p'
        Matcher matcher = p.matcher(m); // Renamed 'input' to'm'
        return matcher.find();
    }

    public static void main(String[] args) {
        RegexLookaheadBug bug = new RegexLookaheadBug();
        System.out.println(bug.showBug("ab"));
        System.out.println(bug.showMutant("ab")); // Calling the mutant method
    }
}