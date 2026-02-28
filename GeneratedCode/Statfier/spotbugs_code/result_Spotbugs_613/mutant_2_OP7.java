import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public String N1() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return 0;
  }

  private boolean getCondition() {
    return false;
  }
}