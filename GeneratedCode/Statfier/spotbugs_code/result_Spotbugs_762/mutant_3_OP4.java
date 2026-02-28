import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;

  public Object f(Object o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should not affect the functionality
      System.out.println("This is a reachable block.");
    } else {
      // Unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
    return o;
  }

  public Object g(@Nullable Object o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should not affect the functionality
      System.out.println("This is a reachable block.");
    } else {
      // Unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
    return o;
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object h(@Nullable Object o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should not affect the functionality
      System.out.println("This is a reachable block.");
    } else {
      // Unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
    s = o;
    return o;
  }

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  public Object bar() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should not affect the functionality
      System.out.println("This is a reachable block.");
    } else {
      // Unreachable block due to the condition being false at runtime
      System.out.println("This is an unreachable block.");
    }
    return f(null); // warning: f()'s parameter is non-null
  }

  private boolean getCondition() {
    // This method returns false to ensure the else block is unreachable
    return false;
  }
}