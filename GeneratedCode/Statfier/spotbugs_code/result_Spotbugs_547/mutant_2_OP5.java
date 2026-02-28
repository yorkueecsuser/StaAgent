import edu.umd.cs.findbugs.annotations.ExpectWarning;
import org.eclipse.jdt.annotation.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;

  public Object f(Object o) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is unreachable because condition can only be true or false
        break;
    }
    return o;
  }

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  public Object g(@Nullable Object o) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is unreachable because condition can only be true or false
        break;
    }
    return o;
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object h(@Nullable Object o) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is unreachable because condition can only be true or false
        break;
    }
    s = o;
    return o;
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public Object bar() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is reachable
        break;
      default:
        // This default case is unreachable because condition can only be true or false
        break;
    }
    return f(null); // warning: f()'s parameter is non-null
  }

  private boolean getCondition() {
    return true; // This method ensures that the switch condition is always true, making the default case unreachable
  }
}