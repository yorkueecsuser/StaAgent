import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExBug {

    public String showBug() {
        int qeisndge = 0;switch  (qeisndge) {case 1:int ysytevdx = -587974556;break;default:boolean ugtrtddz = false;break;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        return pattern.toString();
    
}

    public static void main(String[] args) {
        RegExBug bug = new RegExBug();
        bug.showBug();
    }
}