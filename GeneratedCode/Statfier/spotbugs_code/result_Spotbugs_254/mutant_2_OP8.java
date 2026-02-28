import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
class CheckForNullArrayArgs {

  @NoWarning("NP,RCN")
  protected Object caller(@CheckForNull Object param) {
    final Object[] paramArray = param == null? null : new Object[] {param};
    final Object[] z = paramArray; // Mutant: Renamed paramArray to z
    return methodTakingArray(z);
  }

  @NoWarning("NP,RCN")
  protected Object methodTakingArray(@CheckForNull Object[] params) {
    final Object[] y = params; // Mutant: Renamed params to y
    return y == null? Boolean.FALSE : Boolean.TRUE;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }
}