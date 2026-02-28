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

  // Added unreachable switch statement
  public void someMethod() {
    boolean condition = getCondition();
    switch (getValue()) {
      case 1:
        System.out.println("This is reachable");
        break;
      default:
        if (condition) {
          // This switch is unreachable because getValue() never returns 0
          switch (0) {
            case 1:
              System.out.println("This is unreachable");
              break;
            case 2:
              System.out.println("This is also unreachable");
              break;
          }
        }
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }

  private int getValue() {
    return 1;
  }
}