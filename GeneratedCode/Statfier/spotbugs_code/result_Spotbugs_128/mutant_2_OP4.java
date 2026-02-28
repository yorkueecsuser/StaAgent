import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;

class RepeatedConditionals {
  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean simple(int a, int b) {
    return a == b && a == b;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to true
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean unboxing(Integer a) {
    return a > 5 && a > 5;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to true
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean strings(String a, String b) {
    return a.trim().compareTo(b.trim()) > 0 && a.trim().compareTo(b.trim()) > 0;
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to true
      System.out.println("This is unreachable");
    }
  }

  @ExpectWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean equalsTest(File a, File b) {
    return a.equals(b) && a.equals(b);
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to true
      System.out.println("This is unreachable");
    }
  }

  @NoWarning("RpC_REPEATED_CONDITIONAL_TEST")
  public boolean sideEffect(File a) {
    return a.delete() && a.delete();
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if condition is true
      System.out.println("This is reachable if condition is true");
    } else {
      // This block is unreachable because condition is never set to true
      System.out.println("This is unreachable");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}