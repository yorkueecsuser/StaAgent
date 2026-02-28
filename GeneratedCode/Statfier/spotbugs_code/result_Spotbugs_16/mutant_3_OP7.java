import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2011_03_30 {

  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f(boolean b, Long x, long y) {
    Long z = b? x : y;
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
    return z;
  }

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f2(boolean b, Long x, long y) {
    Long z = b? y : x;
    // Introduced unreachable while loop
    boolean conditionWhile = getAnotherCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is always false
    }
    return z;
  }

  // Method to provide a dynamic but always false condition
  private boolean getCondition() {
    return false;
  }

  // Another method to provide a dynamic but always false condition
  private boolean getAnotherCondition() {
    return false;
  }
}