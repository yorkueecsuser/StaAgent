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

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning("TQ")
  void violationReport(@Tainted Object a) {
    Object y = a;
    requiresUntainted(y);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  protected abstract void requiresUntainted(@Untainted Object o);

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}