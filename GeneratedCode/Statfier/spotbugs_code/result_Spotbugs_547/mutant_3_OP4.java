import edu.umd.cs.findbugs.annotations.ExpectWarning;
import org.eclipse.jdt.annotation.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;

  public Object f(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in f");
    }
    return o;
  }

  @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
  public Object g(@Nullable Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in g");
    }
    return o;
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object h(@Nullable Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in h");
    }
    s = o;
    return o;
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public Object bar() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in bar");
    }
    return f(null); // warning: f()'s parameter is non-null
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}