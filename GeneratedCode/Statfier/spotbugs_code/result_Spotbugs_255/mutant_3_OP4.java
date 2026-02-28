import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class CheckForNullVarArgs {

  @NoWarning("NP,RCN")
  protected Object caller(@CheckForNull Object param) {
    final Object[] paramArray = param == null? null : new Object[] {param};
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
      if (condition) {
        // This block is unreachable because condition is already true
        return Boolean.FALSE;
      } else {
        // This block is also unreachable
        return Boolean.TRUE;
      }
    }
    return method(paramArray);
  }

  @NoWarning("NP,RCN")
  protected Object method(@CheckForNull Object... params) {
    return params == null? Boolean.FALSE : Boolean.TRUE;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }

  private boolean getCondition() {
    // This method returns a constant false, but it is not a compile-time constant
    return false;
  }
}