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

  // Mutation Operator: Renaming
  // Description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
  // Core Requirements:
  // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
  // 2. Generated mutated Java code MUST compile successfully.
  // 3. Mutant code being added MUST be unique not generic.
  // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
  // 5. Generated mutated Java code MUST avoid unreachable statement error.
  //
  // Renamed Variable: pattern
  // Mutated Code:
  Pattern patternRenamed = Pattern.compile("^a|b|c$");
  Matcher matcher = patternRenamed.matcher(input);
  if (matcher.find()) {
    return matcher.group();
  }
  return null;
}