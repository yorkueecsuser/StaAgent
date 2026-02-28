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

  // Introduced unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    switch (getValue()) {
      case 1:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("Default case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 0;
  }
}