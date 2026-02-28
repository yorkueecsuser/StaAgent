import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExBug {
  // BUG: Alternatives in regular expressions should be grouped when used with anchors
  public static String showBug(String input) {
    Pattern pattern = Pattern.compile("^a|b|c$");
    Matcher matcher = pattern.matcher(input);
    if (matcher.find()) {
      return matcher.group();
    }
    return null;
  }

  // Mutant: Unreachable for loop
  public static String showMutant(String input) {
    Pattern pattern = Pattern.compile("^a|b|c$");
    Matcher matcher = pattern.matcher(input);
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      if (matcher.find()) {
        return matcher.group();
      }
    }
    return null;
  }
}