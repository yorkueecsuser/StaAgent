import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BackReferenceBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(.)|\\1"); // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
        int edssfdtl = 0;switch  (edssfdtl) {case 1:byte qkcvleet = 79;break;default:float dbzeipvv = 578860198;break;}
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
}