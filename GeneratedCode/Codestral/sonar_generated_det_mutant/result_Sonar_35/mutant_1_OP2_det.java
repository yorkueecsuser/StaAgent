import java.util.regex.Pattern;

class RegexPossessiveBug {
public boolean showBug(String input){
    Pattern pattern = Pattern.compile("a++abc");
    pattern = Pattern.compile("a++abc");
    return pattern.matcher(input ).matches();
}
}