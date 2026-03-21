import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String input) {
        for  (int errsbzxz = 0; errsbzxz < 0; errsbzxz++) {short qqfvnrxa = -470;}
        Pattern pattern = Pattern.compile("(?:x?)*"); // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    
}
}