import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_11_02 {

  @ExpectWarning("RV_EXCEPTION_NOT_THROWN")
  @NoWarning("RV_RETURN_VALUE_IGNORED")
  public void setCheckedElements(Object[] elements) {
    new UnsupportedOperationException();

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
      System.out.println("This is an unreachable loop");
    }
  }

  private boolean getCondition() {
    return false;
  }
}