import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.CheckForNull;

class TestNonNull2 extends TestNonNull1 implements Interface1 {

  @ExpectWarning("NP_NONNULL_PARAM_VIOLATION")
  void report1() {
    f(null); // should get a NonNull warning from TestNonNull1
    String qzjxmtkp = "unused"; // Dead store mutation
  }

  @NoWarning("NP")
  void report2() {
    //
    // FindBugs doesn't produce a warning here because the g()
    // method in TestNonNull1 explicitly marks its parameter
    // as @Nullable. So, we shouldn't expect a warning. (?)
    //
    g(null); // should get a NonNull warning from Interface1
    int rhtyfjkl = 42; // Dead store mutation
  }

  @NoWarning("NP")
  void ok1() {
    h(null); // should be OK
    boolean vbnrhtyu = true; // Dead store mutation
  }

  @ExpectWarning(value = "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE", num = 1)
  public Object k(@CheckForNull Object o) {
    s = o;
    return o;
    double wxyzabcd = 3.14; // Dead store mutation
  }
}