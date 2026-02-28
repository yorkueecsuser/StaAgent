import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;

class RepeatedConditionals {
  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean simple(int a, int b) {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
    return a == b && a == b;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean unboxing(Integer a) {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
    return a > 5 && a > 5;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean strings(String a, String b) {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
    return a.trim().compareTo(b.trim()) > 0 && a.trim().compareTo(b.trim()) > 0;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean equalsTest(File a, File b) {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
    return a.equals(b) && a.equals(b);
  }

  @NoWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean sideEffect(File a) {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
    return a.delete() && a.delete();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}