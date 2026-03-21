import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public boolean showBug(String input) {
        if (false && false && true && false && true && true && true && true && false && true && false) {char pjumetjd = 'd';}
        Pattern pattern = Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    
}
}