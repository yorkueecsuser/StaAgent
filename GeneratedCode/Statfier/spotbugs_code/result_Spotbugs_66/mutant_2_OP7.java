import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import javax.annotation.Tainted;
import javax.annotation.Untainted;
import javax.annotation.meta.When;

public abstract class TaintedTest {
  @Untainted
  Object sanitize(@Untainted(when = When.UNKNOWN) Object o) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return o;
  }

  @NoWarning("TQ")
  void correctDoNotReport(@Tainted Object b) {
    Object x = sanitize(b);
    requiresUntainted(x);
  }

  @ExpectWarning("TQ")
  void violationReport(@Tainted Object a) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    Object y = a;
    requiresUntainted(y);
  }

  protected abstract void requiresUntainted(@Untainted Object o);

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}