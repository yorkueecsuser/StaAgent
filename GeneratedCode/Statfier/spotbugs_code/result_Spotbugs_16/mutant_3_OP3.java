import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2011_03_30 {

  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f(boolean b, Long x, long y) {
    Long z = b? x : y;
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      z = x + y; // This line is unreachable because condition is always false
    }
    return z;
  }

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f2(boolean b, Long x, long y) {
    Long z = b? y : x;
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      z = x - y; // This line is unreachable because condition is always false
    }
    return z;
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false;
  }
}