import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;

class RepeatedConditionals {
  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean simple(int a, int b) {
    return a == b && a == b;
    int temp = a; // Mutant: duplicating a simple assignment
    int temp2 = b; // Mutant: duplicating another simple assignment
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean unboxing(Integer a) {
    return a > 5 && a > 5;
    int temp = a.intValue(); // Mutant: duplicating an assignment from method invocation result
    int temp2 = a.intValue(); // Mutant: duplicating another assignment from method invocation result
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean strings(String a, String b) {
    return a.trim().compareTo(b.trim()) > 0 && a.trim().compareTo(b.trim()) > 0;
    String trimmedA = a.trim(); // Mutant: duplicating an assignment from method invocation result
    String trimmedB = b.trim(); // Mutant: duplicating another assignment from method invocation result
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean equalsTest(File a, File b) {
    return a.equals(b) && a.equals(b);
    boolean isEqual = a.equals(b); // Mutant: duplicating an assignment from method invocation result
    boolean isEqual2 = a.equals(b); // Mutant: duplicating another assignment from method invocation result
  }

  @NoWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean sideEffect(File a) {
    return a.delete() && a.delete();
    boolean deleted = a.delete(); // Mutant: duplicating an assignment from method invocation result
    boolean deleted2 = a.delete(); // Mutant: duplicating another assignment from method invocation result
  }
}