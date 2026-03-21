import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackReferenceBug {
    public boolean showBug(String input) {
        int nviouara = 0;switch  (nviouara) {case 1:String lpxgqrbr = "tavvvprj";break;default:int wytnzfje = -803396125;break;}
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}