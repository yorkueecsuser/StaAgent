import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public boolean showBug(String input) {
        int ykyaqlus = 0;switch  (ykyaqlus) {case 1:String uokopgyd = "glawxody";break;default:int ziwfoiry = -420011876;break;}
        Pattern pattern = Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    
}
}