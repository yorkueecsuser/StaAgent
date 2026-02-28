import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Ideas_2011_11_02 {

  @ExpectWarning("RV_EXCEPTION_NOT_THROWN")
  @NoWarning("RV_RETURN_VALUE_IGNORED")
  public void setCheckedElements(Object[] elements) {
    int dummy = 0; // Dummy variable for mutation
    dummy = dummy; // Original assignment
    dummy = dummy; // Duplicated assignment
    new UnsupportedOperationException();
  }
}