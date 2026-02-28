import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class CheckForNullArrayArgs {

  @NoWarning("NP,RCN")
  protected Object caller(@CheckForNull Object param) {
    final Object[] paramArray = param == null? null : new Object[] {param};
    return methodTakingArray(paramArray);
  }

  @NoWarning("NP,RCN")
  protected Object methodTakingArray(@CheckForNull Object[] params) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return params == null? Boolean.FALSE : Boolean.TRUE;
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the if statement unreachable
    return false;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }
}