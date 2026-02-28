import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1487083 {
  @NoWarning("MS_SHOULD_BE_FINAL")
  @ExpectWarning("MS_SHOULD_BE_REFACTORED_TO_BE_FINAL")
  public static int falsePos;

  static {
    try {
      falsePos = Integer.parseInt(System.getProperty("false.positive"));
    } catch (NumberFormatException nfe) {
      falsePos = 10;
    }

    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      falsePos = 20;
    } else {
      // This block will always execute
      falsePos = 30;
    }
  }

  private static boolean getCondition() {
    // Always return false to make the if branch unreachable
    return false;
  }
}