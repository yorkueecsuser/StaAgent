import edu.umd.cs.findbugs.annotations.ExpectWarning;
import org.eclipse.jdt.annotation.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;

  public Object f(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed due to the condition
      o = new Object();
    } else {
      // Alternative code that will also never be executed due to the condition
      o = null;
    }
    return o;
  }

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  public Object g(@Nullable Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed due to the condition
      o = new Object();
    } else {
      // Alternative code that will also never be executed due to the condition
      o = null;
    }
    return o;
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object h(@Nullable Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed due to the condition
      s = new Object();
    } else {
      // Alternative code that will also never be executed due to the condition
      s = null;
    }
    s = o;
    return o;
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public Object bar() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed due to the condition
      return f(new Object());
    } else {
      // Alternative code that will also never be executed due to the condition
      return f(null);
    }
    return f(null); // warning: f()'s parameter is non-null
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}