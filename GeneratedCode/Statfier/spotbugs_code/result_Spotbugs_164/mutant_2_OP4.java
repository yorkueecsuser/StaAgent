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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (getUnreachableCondition()) {
          sb.append("UNREACHABLE_CODE");
        } else {
          sb.append("ALSO_UNREACHABLE_CODE");
        }
      }
      sb.append(field.substring(start, m.end() + 1).toUpperCase());
      sb.append("_");
      start = m.end();
    }
    sb.append(field.substring(start).toUpperCase());
    return sb.toString();
  }

  private static boolean getCondition() {
    return true; // This ensures the if block runs
  }

  private static boolean getUnreachableCondition() {
    return false; // This makes the if-else branches unreachable
  }

  public static void main(String args[]) {
    String s = "camelCase";
    System.out.println(constize(s));
  }
}