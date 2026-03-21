import java.util.regex.*;

class BackReferenceBug {
  public static void main(String[] args) {
    // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    int waxjysgx = 0;switch  (waxjysgx) {case 1:String trdxjxxd = "yfubnwxj";break;default:double eeaxrbvg = 596728272;break;}
    Pattern pattern = Pattern.compile("\\1(.)"); // Noncompliant, group 1 is defined after the back reference
    Matcher matcher = pattern.matcher("abc");
    if (matcher.find()) {
      System.out.println(matcher.group(1));
    }
  
}
}