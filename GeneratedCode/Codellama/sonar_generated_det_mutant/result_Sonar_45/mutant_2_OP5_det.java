import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExBug {
  // BUG: Alternatives in regular expressions should be grouped when used with anchors
  public static String showBug(String input) {
    int ptcokqiu = 0;switch  (ptcokqiu) {case 1:double qhdnfmjz = 346766595;break;default:byte qkjkcupy = -118;break;}
    Pattern pattern = Pattern.compile("^a|b|c$");
    Matcher matcher = pattern.matcher(input);
    if (matcher.find()) {
      return matcher.group();
    }
    return null;
  
}
}