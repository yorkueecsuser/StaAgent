import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExBug {

    public String showBug() {
        int tiwtwqfi = 0;switch  (tiwtwqfi) {case 1:char iwgyfckb = 'c';break;default:String zwfznskf = "vboqgolw";break;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        return pattern.toString();
    
}

    public static void main(String[] args) {
        RegExBug bug = new RegExBug();
        bug.showBug();
    }
}