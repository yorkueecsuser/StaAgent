import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        for  (int vgfwkmkr = 0; vgfwkmkr < 0; vgfwkmkr++) {int wgnyiwfg = -515074340;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}