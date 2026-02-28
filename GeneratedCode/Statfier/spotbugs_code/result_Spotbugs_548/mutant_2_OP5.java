import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;

class TestNonNull2 extends TestNonNull1 implements Interface1 {

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  void report1() {
    f(null); // should get a NonNull warning from TestNonNull1

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("NP")
  void report2() {
    //
    // FindBugs doesn't produce a warning here because the g()
    // method in TestNonNull1 explicitly marks its parameter
    // as @Nullable. So, we shouldn't expect a warning. (?)
    //
    g(null); // should get a NonNull warning from Interface1

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  @NoWarning("NP")
  void ok1() {
    h(null); // should be OK

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object k(@CheckForNull Object o) {
    s = o;
    return o;

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}