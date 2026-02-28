import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2008_09_15 {

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceof(Object x) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    
    if (Integer.class.isInstance(x)) return (String) x;
    return "";
  }

  @ExpectWarning(value = "BC_IMPOSSIBLE_CAST", num = 1)
  public String alternativesToInstanceofAndCheckedCast(Object x) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    
    if (Integer.class.isInstance(x)) return String.class.cast(x);
    return "";
  }

  private boolean getCondition() {
    return false;
  }
}