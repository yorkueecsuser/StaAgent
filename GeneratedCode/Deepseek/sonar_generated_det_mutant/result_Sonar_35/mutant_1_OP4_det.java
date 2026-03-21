import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        if (true && true && true && false && true && false && true && false && false && true && false) {boolean plompjsf = true;}else{short cyrpvpcp = -5991;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}