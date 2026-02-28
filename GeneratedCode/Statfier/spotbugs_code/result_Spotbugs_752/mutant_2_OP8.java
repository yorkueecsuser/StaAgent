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
  }

  // Mutated code
  static {
    try {
      int a = Integer.parseInt(System.getProperty("false.positive"));
      falsePos = a;
    } catch (NumberFormatException nfe) {
      int b = 10;
      falsePos = b;
    }
  }
}