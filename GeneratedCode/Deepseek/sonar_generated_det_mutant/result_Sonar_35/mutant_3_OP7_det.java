import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        boolean idccyysh = false;while (idccyysh && false && false && true && false && false && true && true && false && false && false && false) {String rifgigib = "hqxqubtx";}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}