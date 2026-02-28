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
    return params == null? Boolean.FALSE : Boolean.TRUE;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }

  // Mutated code
  @NoWarning("NP,RCN")
  protected Object caller(@CheckForNull Object a) {
    final Object[] b = a == null? null : new Object[] {a};
    return method(b);
  }

  @NoWarning("NP,RCN")
  protected Object method(@CheckForNull Object... c) {
    return c == null? Boolean.FALSE : Boolean.TRUE;
  }

  @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
  public void infiniteRecursiveLoop() {
    infiniteRecursiveLoop();
  }
}