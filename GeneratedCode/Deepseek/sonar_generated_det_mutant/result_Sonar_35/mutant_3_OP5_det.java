import java.util.regex.*;

class RegexBug {

    public Pattern showBug() {
        int ymyysvfc = 0;switch  (ymyysvfc) {case 1:float ikiepjki = -18454548;break;default:String cadgexny = "dgjcfllr";break;}
        Pattern pattern1 = Pattern.compile("a++abc");       // BUG: Regex patterns following a possessive quantifier should not always fail
        return pattern1;
    
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}