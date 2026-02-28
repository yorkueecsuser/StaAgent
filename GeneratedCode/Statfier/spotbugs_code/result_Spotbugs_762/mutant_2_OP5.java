import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;

  public Object f(Object o) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return o;
  }

  public Object g(@Nullable Object o) {
    return o;
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object h(@Nullable Object o) {
    s = o;
    return o;
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public Object bar() {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        System.out.println("This is another unreachable switch case.");
        break;
    }
    return f(null); // warning: f()'s parameter is non-null
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}