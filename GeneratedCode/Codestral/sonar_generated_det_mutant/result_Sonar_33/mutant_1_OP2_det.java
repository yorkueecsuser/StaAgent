import java.util.regex.Pattern;

class RegularExpressionBug {
public String showBug(String input){
    Pattern pattern = Pattern.compile("(a|b)*");
    pattern = Pattern.compile("(a|b)*");
    return pattern.matcher(input ).group();
}
}