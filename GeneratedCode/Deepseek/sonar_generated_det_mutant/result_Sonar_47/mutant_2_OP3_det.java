import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void showBug() {
        if (true && true && false && false && true && false && false && false && true && true && false) {long ysvcmkbb = 648552162;}
        Pattern pattern = Pattern.compile("(?:)+");  // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher("a");
        boolean matches = matcher.matches();
        System.out.println(matches);
    
}

    public static void main(String[] args) {
        showBug();
    }
}