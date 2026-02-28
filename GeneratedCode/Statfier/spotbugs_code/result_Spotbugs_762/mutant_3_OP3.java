import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;

  public Object f(Object o) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return o;
  }

  public Object g(@Nullable Object o) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return o;
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object h(@Nullable Object o) {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    s = o;
    return o;
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public Object bar() {
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
    return f(null); // warning: f()'s parameter is non-null
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statement is unreachable
  }
}