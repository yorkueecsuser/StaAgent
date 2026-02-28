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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
    return Math.ceil(x);
  }

  @ExpectWarning("ICAST_INT_CAST_TO_DOUBLE_PASSED_TO_CEIL")
  public double bug(long x) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
    return Math.ceil(x);
  }

  private boolean getCondition() {
    // This method always returns false, making the else block unreachable
    return false;
  }
}