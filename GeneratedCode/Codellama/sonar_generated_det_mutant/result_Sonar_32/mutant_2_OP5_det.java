import java.util.regex.*;

class BackReferenceBug {
  public static void main(String[] args) {
    // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    int cpvkgitw = 0;switch  (cpvkgitw) {case 1:String hiyoaobo = "tljuyemm";break;default:float hhxqtmyw = -306311008;break;}
    Pattern pattern = Pattern.compile("\\1(.)"); // Noncompliant, group 1 is defined after the back reference
    Matcher matcher = pattern.matcher("abc");
    if (matcher.find()) {
      System.out.println(matcher.group(1));
    }
  
}
}