import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2011_03_30 {

  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f(boolean b, Long x, long y) {
    Long z = b? x : y;
    
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      z = x + y;
    }
    
    return z;
  }

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f2(boolean b, Long x, long y) {
    Long z = b? y : x;
    
    // Inserting an unreachable while loop
    boolean conditionWhile2 = getCondition2();
    while (conditionWhile2) {
      // This loop is unreachable because conditionWhile2 is never set to true
      z = x - y;
    }
    
    return z;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }

  // Another method to provide a different dynamic condition that is always false
  private boolean getCondition2() {
    return false;
  }
}