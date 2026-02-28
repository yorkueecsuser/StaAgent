import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_11_02 {

  @ExpectWarning("RV_EXCEPTION_NOT_THROWN")
  @NoWarning("RV_RETURN_VALUE_IGNORED")
  public void setCheckedElements(Object[] elements) {
    new UnsupportedOperationException();

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed");
    }
  }

  private boolean getCondition() {
    return false;
  }
}