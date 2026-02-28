import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2011_03_30 {

  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f(boolean b, Long x, long y) {
    Long z = b? x : y;
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
    return z;
  }

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f2(boolean b, Long x, long y) {
    Long z = b? y : x;
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is dynamically determined to be false
    }
    return z;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}