import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2011_03_30 {

  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f(boolean b, Long x, long y) {
    Long z = b? x : y;
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      Long temp = x + y;
      z = temp;
    } else {
      // Alternative block
      z = z + 1;
    }
    return z;
  }

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f2(boolean b, Long x, long y) {
    Long z = b? y : x;
    // Mutant: Adding an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      Long temp = x * y;
      z = temp;
    } else {
      // Alternative block
      z = z - 1;
    }
    return z;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the if block is not executed at runtime
  }
}