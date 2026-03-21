import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public boolean showBug(String input) {
        int dcwvwnyl = 0;switch  (dcwvwnyl) {case 1:int ybjigbjm = 542780231;break;default:int lvxroqdv = 199132597;break;}
        Pattern pattern = Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    
}
}