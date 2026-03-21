import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        if (true && true && false && true && false && true && true && true && false && false && false) {float mzrihbgr = -182477549;}else{char emmgaiav = 'b';}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}