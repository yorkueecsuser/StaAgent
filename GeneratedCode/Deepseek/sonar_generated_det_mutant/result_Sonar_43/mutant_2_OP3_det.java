import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExBug {

    public String showBug() {
        if (false && false && false && false && true && true && false && false && true && false && false) {short hhguduuo = 5080;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        return pattern.toString();
    
}

    public static void main(String[] args) {
        RegExBug bug = new RegExBug();
        bug.showBug();
    }
}