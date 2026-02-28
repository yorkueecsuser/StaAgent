import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_INTEGER_MULTIPLY_CAST_TO_LONG {

  @ExpectWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void bug(int any1, int any2) {
    long x = any1 * any2;
    System.out.println(x);

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
  }

  @DesireNoWarning("ICAST_INTEGER_MULTIPLY_CAST_TO_LONG")
  void notBug(int any1) {
    long x = any1 * 1000;
    System.out.println(x);

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}