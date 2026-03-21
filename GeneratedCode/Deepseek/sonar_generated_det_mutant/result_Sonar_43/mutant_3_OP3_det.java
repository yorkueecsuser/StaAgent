import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExBug {

    public String showBug() {
        if (false && true && false && false && false && false && false && true && true && false && false) {String onvbkjkk = "eqaxdwxn";}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        return pattern.toString();
    
}

    public static void main(String[] args) {
        RegExBug bug = new RegExBug();
        bug.showBug();
    }
}