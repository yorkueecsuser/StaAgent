import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExBug {
public String showBug() {
    Pattern pattern = Pattern.compile("([");
    pattern = Pattern.compile("([");
    return pattern.toString();
}

    public static void main(String[] args) {
        RegExBug bug = new RegExBug();
        bug.showBug();
    }
}