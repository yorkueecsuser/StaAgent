import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;

class TestNonNull2 extends TestNonNull1 implements Interface1 {

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  void report1() {
    f(null); // should get a NonNull warning from TestNonNull1
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  @NoWarning("NP")
  void ok1() {
    h(null); // should be OK
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object k(@CheckForNull Object o) {
    s = o;
    return o;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never be printed");
    } else {
      // Alternative code that should also never run
      System.out.println("This should also never be printed");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if-else branches unreachable
  }
}