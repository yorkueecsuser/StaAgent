import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class CheckForNullVarArgs {

  @NoWarning("NP,RCN")
  protected Object caller(@CheckForNull Object param) {
    final Object[] paramArray = param == null? null : new Object[] {param};
    return method(paramArray);
  }

  @NoWarning("NP,RCN")
  protected Object method(@CheckForNull Object... params) {
    // Inserting an unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      return Boolean.FALSE;
    }
    return params == null? Boolean.FALSE : Boolean.TRUE;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }

  // Method to provide a dynamic but always false condition
  private boolean getUnreachableCondition() {
    return false;
  }
}