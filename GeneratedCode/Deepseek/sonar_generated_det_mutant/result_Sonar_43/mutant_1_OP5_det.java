import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExBug {

    public String showBug() {
        int zrtvhzqy = 0;switch  (zrtvhzqy) {case 1:long nfusnyzc = 426284641;break;default:String rnylruxs = "upemhyhm";break;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        return pattern.toString();
    
}

    public static void main(String[] args) {
        RegExBug bug = new RegExBug();
        bug.showBug();
    }
}