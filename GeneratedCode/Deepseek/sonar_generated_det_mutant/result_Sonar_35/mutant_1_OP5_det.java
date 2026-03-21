import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        int qnjjqlrl = 0;switch  (qnjjqlrl) {case 1:String wgqxixdo = "xeckwyli";break;default:long zxthwuft = -775861225;break;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}