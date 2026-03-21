import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        int mgncldws = 0;switch  (mgncldws) {case 1:short razwrnel = 9175;break;default:byte xylfyowz = -33;break;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}