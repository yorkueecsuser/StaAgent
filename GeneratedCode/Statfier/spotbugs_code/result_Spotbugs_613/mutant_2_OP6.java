import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public String N1() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return 0;
  }

  private boolean getCondition() {
    return false;
  }
}