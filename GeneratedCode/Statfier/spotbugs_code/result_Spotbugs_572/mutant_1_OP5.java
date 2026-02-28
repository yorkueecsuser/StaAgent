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
    return c.size();

    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("This is also unreachable code");
        break;
    }
  }

  @NoWarning("NP")
  public int test2(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    return 0;

    // Introduced unreachable switch statement
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable code in test2");
        break;
      default:
        System.out.println("This is also unreachable code in test2");
        break;
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}