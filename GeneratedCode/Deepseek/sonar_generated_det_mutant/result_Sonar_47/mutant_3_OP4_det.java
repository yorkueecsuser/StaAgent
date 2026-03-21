import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void showBug() {
        if (false && true && true && false && false && false && false && false && true && false && false) {short jirhdnab = 7364;}else{boolean mfolmwve = true;}
        Pattern pattern = Pattern.compile("(?:)+");  // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher("a");
        boolean matches = matcher.matches();
        System.out.println(matches);
    
}

    public static void main(String[] args) {
        showBug();
    }
}