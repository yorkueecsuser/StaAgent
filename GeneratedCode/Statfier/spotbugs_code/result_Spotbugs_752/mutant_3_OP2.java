import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1487083 {
  @NoWarning("MS_SHOULD_BE_FINAL")
  @ExpectWarning("MS_SHOULD_BE_REFACTORED_TO_BE_FINAL")
  public static int falsePos;

  static {
    try {
      falsePos = Integer.parseInt(System.getProperty("false.positive"));
      falsePos = 5; // Mutant: duplicated assignment without method invocation
    } catch (NumberFormatException nfe) {
      falsePos = 10;
      falsePos = 20; // Mutant: duplicated assignment without method invocation
    }
  }
}