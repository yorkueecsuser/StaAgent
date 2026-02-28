import edu.umd.cs.findbugs.annotations.ExpectWarning;

class N2 extends N1 {
  @ExpectWarning("Nm")
  public void mincemeaT() {}

  public String N1() {
    return "yeah";
  }

  @ExpectWarning("Nm")
  public String tostring() {
    return "mmm";
  }

  @ExpectWarning("Nm")
  public int hashcode() {
    return 0;
  }

  // Introduced an unreachable if-else statement
  private boolean getCondition() {
    return false;
  }

  public void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will always be printed");
    }
  }
}