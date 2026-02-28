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

      // Inserting unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          sb.append("UNREACHABLE");
          break;
        default:
          // Do nothing
          break;
      }
    }
    sb.append(field.substring(start).toUpperCase());
    return sb.toString();
  }

  private static boolean getAlwaysFalse() {
    return false;
  }

  public static void main(String args[]) {
    String s = "camelCase";
    System.out.println(constize(s));
  }
}