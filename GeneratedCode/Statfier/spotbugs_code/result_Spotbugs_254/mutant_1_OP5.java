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
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because condition is always false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return params == null? Boolean.FALSE : Boolean.TRUE;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch case is unreachable
  }
}