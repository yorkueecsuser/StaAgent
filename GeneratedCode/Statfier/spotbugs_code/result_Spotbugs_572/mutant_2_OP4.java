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
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block");
    } else {
      // Alternative block
      System.out.println("This is the alternative block");
    }
    return c.size();
  }

  @NoWarning("NP")
  public int test2(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      System.out.println("This is another unreachable block");
    } else {
      // Alternative block
      System.out.println("This is another alternative block");
    }
    return 0;
  }

  private boolean getCondition() {
    // This method always returns false, making the if-block unreachable
    return false;
  }
}