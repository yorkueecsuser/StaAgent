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
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable code");
    } else {
      System.out.println("This is also unreachable code");
    }
    return c.size();
  }

  @NoWarning("NP")
  public int test2(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable code in test2");
    } else {
      System.out.println("This is also unreachable code in test2");
    }
    return 0;
  }

  // Method to provide a dynamic condition for the mutant
  private boolean getCondition() {
    return false; // This will ensure the branches are unreachable
  }
}