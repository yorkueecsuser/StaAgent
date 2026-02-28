import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;

class TestNonNull2 extends TestNonNull1 implements Interface1 {

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  void report1() {
    f(null); // should get a NonNull warning from TestNonNull1
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in report1");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in report1");
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in report2");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in report2");
    }
  }

  @NoWarning("NP")
  void ok1() {
    h(null); // should be OK
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in ok1");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in ok1");
    }
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object k(@CheckForNull Object o) {
    s = o;
    return o;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is unreachable code in k");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in k");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}