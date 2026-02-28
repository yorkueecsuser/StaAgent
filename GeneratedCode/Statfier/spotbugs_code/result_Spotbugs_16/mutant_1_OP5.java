import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2011_03_30 {

  @DesireWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f(boolean b, Long x, long y) {
    Long z = b? x : y;
    return z;
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        Long unused = 1L;
        break;
      default:
        // Default case is also unreachable due to the same reason
        unused = 2L;
        break;
    }
  }

  @ExpectWarning("BX_UNBOXING_IMMEDIATELY_REBOXED")
  public Long f2(boolean b, Long x, long y) {
    Long z = b? y : x;
    return z;
    
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is unreachable because condition is never set to true
        Long unused = 1L;
        break;
      default:
        // Default case is also unreachable due to the same reason
        unused = 2L;
        break;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}