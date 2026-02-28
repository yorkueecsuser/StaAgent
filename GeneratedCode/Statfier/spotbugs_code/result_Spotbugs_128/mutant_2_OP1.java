import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;

class RepeatedConditionals {
  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean simple(int a, int b) {
    // Dead store mutation
    String qwertyui = "unused";
    return a == b && a == b;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean unboxing(Integer a) {
    // Dead store mutation
    int asdfghjk = 42;
    return a > 5 && a > 5;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean strings(String a, String b) {
    // Dead store mutation
    boolean zxcvbnm = true;
    return a.trim().compareTo(b.trim()) > 0 && a.trim().compareTo(b.trim()) > 0;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean equalsTest(File a, File b) {
    // Dead store mutation
    double poiuytrew = 3.14;
    return a.equals(b) && a.equals(b);
  }

  @NoWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean sideEffect(File a) {
    // Dead store mutation
    char lkjhgfdsa = 'x';
    return a.delete() && a.delete();
  }
}