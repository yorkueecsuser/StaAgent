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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is unreachable");
        break;
    }
  }

  @ExpectWarning("TQ")
  void violationReport(@Tainted Object a) {
    Object y = a;
    requiresUntainted(y);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always be 1
        System.out.println("This is unreachable");
        break;
    }
  }

  protected abstract void requiresUntainted(@Untainted Object o);

  private boolean getCondition() {
    // This method always returns false, ensuring the switch statement is unreachable
    return false;
  }
}