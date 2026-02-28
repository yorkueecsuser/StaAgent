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

    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if getCondition() returns true
      System.out.println("This is reachable code.");
    } else {
      // This block is unreachable if getCondition() returns true
      System.out.println("This is unreachable code.");
    }
  }

  @ExpectWarning("TQ")
  void violationReport(@Tainted Object a) {
    Object y = a;
    requiresUntainted(y);

    // Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable only if getCondition() returns true
      System.out.println("This is reachable code.");
    } else {
      // This block is unreachable if getCondition() returns true
      System.out.println("This is unreachable code.");
    }
  }

  protected abstract void requiresUntainted(@Untainted Object o);

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the else block is unreachable
  }
}