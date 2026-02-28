import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;

class RepeatedConditionals {
  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean simple(int a, int b) {
    return a == b && a == b;
    int temp = a; // Added duplicate assignment
    int temp2 = b; // Added duplicate assignment
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean unboxing(Integer a) {
    return a > 5 && a > 5;
    int temp = a; // Added duplicate assignment
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean strings(String a, String b) {
    return a.trim().compareTo(b.trim()) > 0 && a.trim().compareTo(b.trim()) > 0;
    String tempA = a; // Added duplicate assignment
    String tempB = b; // Added duplicate assignment
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean equalsTest(File a, File b) {
    return a.equals(b) && a.equals(b);
    File tempA = a; // Added duplicate assignment
    File tempB = b; // Added duplicate assignment
  }

  @NoWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean sideEffect(File a) {
    return a.delete() && a.delete();
    boolean temp = a.exists(); // Added duplicate assignment without side effect
  }
}