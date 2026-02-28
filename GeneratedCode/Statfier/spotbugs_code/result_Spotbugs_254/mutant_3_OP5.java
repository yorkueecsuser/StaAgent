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
    switch(unreachableCondition) {
      case true:
        // This case is unreachable because getUnreachableCondition() always returns false
        System.out.println("This is an unreachable case");
        break;
    }
    return params == null? Boolean.FALSE : Boolean.TRUE;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}