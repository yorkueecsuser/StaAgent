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

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      falsePos = 20;
    } else {
      // This block is also intended to be unreachable
      falsePos = 30;
    }
  }

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return falsePos == -1; // This condition will never be true since falsePos is initialized to 10 or parsed from a property
  }
}