import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class CheckForNullArrayArgs {

  @NoWarning("NP,RCN")
  protected Object caller(@CheckForNull Object param) {
    final Object[] paramArray = param == null? null : new Object[] {param};
    final Object[] b = paramArray; // Mutant variable introduced
    return methodTakingArray(b);
  }

  @NoWarning("NP,RCN")
  protected Object methodTakingArray(@CheckForNull Object[] params) {
    final Object[] c = params; // Mutant variable introduced
    return c == null? Boolean.FALSE : Boolean.TRUE;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }
}