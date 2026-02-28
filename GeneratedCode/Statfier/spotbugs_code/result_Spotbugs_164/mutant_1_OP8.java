import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Bug3291092 {

  static Pattern CAP_PATTERN = Pattern.compile("[a-z_0-9]+");

  @NoWarning("IL_INFINITE_LOOP")
  public static String constize(String field) {
    StringBuilder sb = new StringBuilder();
    sb.append(field.charAt(0));
    Matcher m = CAP_PATTERN.matcher(field.substring(1));
    int start = 1;
    while (m.find()) {
      sb.append(field.substring(start, m.end() + 1).toUpperCase());
      sb.append("_");
      start = m.end();
    }
    sb.append(field.substring(start).toUpperCase());
    return sb.toString();
  }

  // Mutated code with renamed variable'sb' to 'a'
  public static String constizeMutant(String field) {
    StringBuilder a = new StringBuilder();
    a.append(field.charAt(0));
    Matcher m = CAP_PATTERN.matcher(field.substring(1));
    int x = 1;
    while (m.find()) {
      a.append(field.substring(x, m.end() + 1).toUpperCase());
      a.append("_");
      x = m.end();
    }
    a.append(field.substring(x).toUpperCase());
    return a.toString();
  }

  public static void main(String args[]) {
    String s = "camelCase";
    System.out.println(constize(s));
    System.out.println(constizeMutant(s)); // Additional call to mutant method
  }
}