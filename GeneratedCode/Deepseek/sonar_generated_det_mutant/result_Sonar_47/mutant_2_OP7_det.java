import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void showBug() {
        boolean lerikmhp = false;while (lerikmhp && true && false && true && false && true && true && false && true && false && true && false) {double ltcyhaio = 578804157;}
        Pattern pattern = Pattern.compile("(?:)+");  // BUG: Repeated patterns in regular expressions should not match the empty string
        Matcher matcher = pattern.matcher("a");
        boolean matches = matcher.matches();
        System.out.println(matches);
    
}

    public static void main(String[] args) {
        showBug();
    }
}