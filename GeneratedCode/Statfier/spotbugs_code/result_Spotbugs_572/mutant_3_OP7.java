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
    
    // Unreachable while loop mutant
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop will never execute
    }
    
    return c.size();
  }

  @NoWarning("NP")
  public int test2(Collection c) {
    precondition("dataset connection is not null", c!= null &&!c.isEmpty());
    
    // Unreachable while loop mutant
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop will never execute
    }
    
    return 0;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}