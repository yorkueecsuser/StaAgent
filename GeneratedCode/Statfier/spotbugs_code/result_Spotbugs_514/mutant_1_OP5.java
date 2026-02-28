import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_11_02 {

  @ExpectWarning("RV_EXCEPTION_NOT_THROWN")
  @NoWarning("RV_RETURN_VALUE_IGNORED")
  public void setCheckedElements(Object[] elements) {
    new UnsupportedOperationException();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case is always executed
        System.out.println("This is the reachable case");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}