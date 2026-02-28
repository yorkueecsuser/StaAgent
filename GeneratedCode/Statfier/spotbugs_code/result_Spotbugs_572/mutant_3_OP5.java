import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Collection;

class Bug3531425 {

  public void precondition(String msg, boolean b) {
    if (!b) throw new IllegalStateException(msg);
  }

  @ExpectWarning("NP")
  @DesireNoWarning("NP")
  public int test(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    // Inserting unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case will never be executed because unreachableCondition is always false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return c.size();
  }

  @NoWarning("NP")
  public int test2(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    // Inserting unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case will never be executed because unreachableCondition is always false
        System.out.println("This is another unreachable switch case.");
        break;
    }
    return 0;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}