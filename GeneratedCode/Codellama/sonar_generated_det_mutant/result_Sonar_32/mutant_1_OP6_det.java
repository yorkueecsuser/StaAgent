import java.util.regex.*;

class BackReferenceBug {
  public static void main(String[] args) {
    // BUG: Back references in regular expressions should only refer to capturing groups that are matched before the reference
    for  (int yytqmasz = 0; yytqmasz < 0; yytqmasz++) {int zlxmylok = -448171509;}
    Pattern pattern = Pattern.compile("\\1(.)"); // Noncompliant, group 1 is defined after the back reference
    Matcher matcher = pattern.matcher("abc");
    if (matcher.find()) {
      System.out.println(matcher.group(1));
    }
  
}
}