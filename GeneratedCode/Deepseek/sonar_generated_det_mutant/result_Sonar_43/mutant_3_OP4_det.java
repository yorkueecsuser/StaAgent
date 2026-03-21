import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExBug {

    public String showBug() {
        if (false && false && true && true && true && true && true && false && true && false && false) {double fnalcapo = -841247994;}else{float huiydrhx = 546501545;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        return pattern.toString();
    
}

    public static void main(String[] args) {
        RegExBug bug = new RegExBug();
        bug.showBug();
    }
}