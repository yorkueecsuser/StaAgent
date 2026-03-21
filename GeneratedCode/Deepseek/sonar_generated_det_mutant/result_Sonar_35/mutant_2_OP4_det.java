import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        if (false && true && false && false && false && false && false && true && false && false && false) {short hzraqzvb = -7704;}else{float yqqnovxy = -818414266;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}