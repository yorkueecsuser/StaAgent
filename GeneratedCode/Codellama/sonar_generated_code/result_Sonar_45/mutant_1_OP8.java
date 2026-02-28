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

  // Mutant 1: Renaming variable "input" to "input1"
  public static String showMutant1(String input1) {
    Pattern pattern = Pattern.compile("^a|b|c$");
    Matcher matcher = pattern.matcher(input1);
    if (matcher.find()) {
      return matcher.group();
    }
    return null;
  }

  // Mutant 2: Renaming variable "pattern" to "pattern1"
  public static String showMutant2(String input) {
    Pattern pattern1 = Pattern.compile("^a|b|c$");
    Matcher matcher = pattern1.matcher(input);
    if (matcher.find()) {
      return matcher.group();
    }
    return null;
  }

  // Mutant 3: Renaming variable "matcher" to "matcher1"
  public static String showMutant3(String input) {
    Pattern pattern = Pattern.compile("^a|b|c$");
    Matcher matcher1 = pattern.matcher(input);
    if (matcher1.find()) {
      return matcher1.group();
    }
    return null;
  }
}