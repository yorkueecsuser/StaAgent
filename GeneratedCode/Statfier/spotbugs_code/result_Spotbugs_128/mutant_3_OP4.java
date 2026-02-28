import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;

class RepeatedConditionals {
  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean simple(int a, int b) {
    return a == b && a == b;
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block in simple method.");
    } else {
      System.out.println("This is also an unreachable block in simple method.");
    }
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean unboxing(Integer a) {
    return a > 5 && a > 5;
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block in unboxing method.");
    } else {
      System.out.println("This is also an unreachable block in unboxing method.");
    }
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean strings(String a, String b) {
    return a.trim().compareTo(b.trim()) > 0 && a.trim().compareTo(b.trim()) > 0;
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block in strings method.");
    } else {
      System.out.println("This is also an unreachable block in strings method.");
    }
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean equalsTest(File a, File b) {
    return a.equals(b) && a.equals(b);
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block in equalsTest method.");
    } else {
      System.out.println("This is also an unreachable block in equalsTest method.");
    }
  }

  @NoWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean sideEffect(File a) {
    return a.delete() && a.delete();
    // Mutant: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block in sideEffect method.");
    } else {
      System.out.println("This is also an unreachable block in sideEffect method.");
    }
  }

  // Helper method to provide a dynamically determined condition
  private boolean getCondition() {
    return false;
  }
}