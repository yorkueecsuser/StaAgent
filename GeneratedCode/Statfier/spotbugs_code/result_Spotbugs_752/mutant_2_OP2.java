import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1487083 {
  @NoWarning("MS_SHOULD_BE_FINAL")
  @ExpectWarning("MS_SHOULD_BE_REFACTORED_TO_BE_FINAL")
  public static int falsePos;

  static {
    try {
      falsePos = Integer.parseInt(System.getProperty("false.positive"));
      // Mutant: Duplicate the assignment statement
      falsePos = 20; // This is a unique value to ensure the mutant is different
    } catch (NumberFormatException nfe) {
      falsePos = 10;
      // Mutant: Duplicate the assignment statement
      falsePos = 15; // This is a unique value to ensure the mutant is different
    }
  }
}