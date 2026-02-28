import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to represent an unreachable if statement
    }
  }

  public String N1() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to represent an unreachable if statement
    }
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean condition = getCondition();
    if (condition) {
      // This block is intentionally left empty to represent an unreachable if statement
    }
    return 0;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}