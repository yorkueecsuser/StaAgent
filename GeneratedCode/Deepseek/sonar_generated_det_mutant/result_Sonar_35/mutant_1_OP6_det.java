import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        for  (int rluggdzf = 0; rluggdzf < 0; rluggdzf++) {boolean poixwqri = false;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}