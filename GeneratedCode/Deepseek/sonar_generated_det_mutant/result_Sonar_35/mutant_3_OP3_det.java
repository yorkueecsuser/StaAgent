import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        if (true && true && true && false && false && false && true && true && false && true && false) {short povvpdef = 7592;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}