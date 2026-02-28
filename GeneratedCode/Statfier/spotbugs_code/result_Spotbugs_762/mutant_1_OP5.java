import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.Nullable;

class TestNonNull1 {

  @ExpectWarning(value = "NP_STORE_INTO_NONNULL_FIELD", num = 1)
  public Object s = null;

  public Object f(Object o) {
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
    return f(null); // warning: f()'s parameter is non-null
  }

  // Introduced unreachable switch statement
  public void introduceUnreachableSwitch() {
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("This is also unreachable");
        break;
      default:
        System.out.println("Default case is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0; // Ensures the switch condition always evaluates to 0, making it unreachable
    }
  }
}