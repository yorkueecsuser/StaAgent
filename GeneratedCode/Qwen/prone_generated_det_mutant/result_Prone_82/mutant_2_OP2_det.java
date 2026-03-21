import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {
public String showBug(String input){
    Pattern pattern = Pattern.compile("[");
    Matcher matcher = pattern.matcher(input);
    matcher = pattern.matcher(input);
    return matcher.replaceAll("x");
}

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}