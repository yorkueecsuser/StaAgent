import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Tainted;
import javax.annotation.Untainted;
import javax.annotation.meta.When;

public abstract class TaintedTest {
  @Untainted
  Object sanitize(@Untainted(when = When.UNKNOWN) Object o) {
    return o;
  }

  @NoWarning("TQ")
  void correctDoNotReport(@Tainted Object b) {
    Object x = sanitize(b);
    requiresUntainted(x);

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable");
    } else {
      // This block is unreachable if condition is false
      requiresUntainted(b); // This line should never execute
    }
  }

  @ExpectWarning("TQ")
  void violationReport(@Tainted Object a) {
    Object y = a;
    requiresUntainted(y);

    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is reachable");
    } else {
      // This block is unreachable if condition is false
      requiresUntainted(a); // This line should never execute
    }
  }

  protected abstract void requiresUntainted(@Untainted Object o);

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}