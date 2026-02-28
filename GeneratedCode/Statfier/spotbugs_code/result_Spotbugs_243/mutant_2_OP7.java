import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.Serializable;

class BadReadResolve implements Serializable {

  private static final long serialVersionUID = 1L;

  @ExpectWarning("Se")
  public BadReadResolve readResolve() {
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop will never execute because conditionWhile is false
    }

    return new BadReadResolve();
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}