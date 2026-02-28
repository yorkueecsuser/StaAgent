import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;

class RepeatedConditionals {
  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean simple(int a, int b) {
    return a == b && a == b;
    int temp = a; // Added mutant: duplicating a simple assignment
    int temp2 = b; // Added mutant: duplicating another simple assignment
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean unboxing(Integer a) {
    return a > 5 && a > 5;
    int temp = a.intValue(); // Added mutant: duplicating an assignment from unboxing
    int temp2 = a.intValue(); // Added mutant: duplicating another assignment from unboxing
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean strings(String a, String b) {
    return a.trim().compareTo(b.trim()) > 0 && a.trim().compareTo(b.trim()) > 0;
    String trimmedA = a.trim(); // Added mutant: duplicating an assignment with method invocation, but avoiding side effect
    String trimmedB = b.trim(); // Added mutant: duplicating another assignment with method invocation, but avoiding side effect
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean equalsTest(File a, File b) {
    return a.equals(b) && a.equals(b);
    boolean isEqual = a.equals(b); // Added mutant: duplicating an assignment with method invocation, but avoiding side effect
    boolean isEqualAgain = a.equals(b); // Added mutant: duplicating another assignment with method invocation, but avoiding side effect
  }

  @NoWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean sideEffect(File a) {
    return a.delete() && a.delete();
    boolean isDeleted = a.exists(); // Added mutant: duplicating an assignment with method invocation, but avoiding side effect
    boolean isDeletedAgain = a.exists(); // Added mutant: duplicating another assignment with method invocation, but avoiding side effect
  }
}