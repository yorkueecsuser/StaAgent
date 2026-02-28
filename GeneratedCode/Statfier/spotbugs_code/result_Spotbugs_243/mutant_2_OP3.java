import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.Serializable;

class BadReadResolve implements Serializable {

  private static final long serialVersionUID = 1L;

  @ExpectWarning("Se")
  public BadReadResolve readResolve() {
    // Inserting an unreachable if statement with a dynamically determined condition
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This will never be printed.");
    }
    return new BadReadResolve();
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}