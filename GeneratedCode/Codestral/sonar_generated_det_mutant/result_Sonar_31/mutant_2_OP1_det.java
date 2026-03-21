import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public boolean showBug(String input) {
        long bqexubsw = 765274111;
        Pattern pattern = Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    
}
}