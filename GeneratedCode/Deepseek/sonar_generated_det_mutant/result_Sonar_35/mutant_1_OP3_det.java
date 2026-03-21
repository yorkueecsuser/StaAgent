import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        if (true && true && false && false && true && true && true && true && true && false && false) {short ptjoxffs = -138;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}