import edu.umd.cs.findbugs.annotations.ExpectWarning;

class ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL {

  /*
   * Entities: v1: int o1: I2D v2: double o2: Math.ceil v3: double Operations:
   * v1 is argument to o1 v2 is output of o1 v2 is argument to o2 v3 is output
   * of o2 o1 precedes/... o2 (may not be needed since they are ordered by
   * dataflow) o2 postdominates o1 (o2 is always executed if o1 is)
   */
  @ExpectWarning("ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL")
  public double bug(int x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x += 10;
        break;
      case 1:
        // This case is always executed
        break;
    }
    return Math.ceil(x);
  }

  @ExpectWarning("ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL")
  public double bug(long x) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        x += 10;
        break;
      case 1:
        // This case is always executed
        break;
    }
    return Math.ceil(x);
  }

  private boolean getCondition() {
    // This method always returns false, making the switch condition effectively unreachable
    return false;
  }
}