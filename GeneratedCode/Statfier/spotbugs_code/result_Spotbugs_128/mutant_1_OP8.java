import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;

class RepeatedConditionals {
  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean simple(int a, int b) {
    return a == b && a == b;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean unboxing(Integer x) {
    return x > 5 && x > 5;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean strings(String c, String d) {
    return c.trim().compareTo(d.trim()) > 0 && c.trim().compareTo(d.trim()) > 0;
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean equalsTest(File e, File f) {
    return e.equals(f) && e.equals(f);
  }

  @NoWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean sideEffect(File g) {
    return g.delete() && g.delete();
  }
}