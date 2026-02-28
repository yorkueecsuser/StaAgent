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
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("Default case - this will never be printed either");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}