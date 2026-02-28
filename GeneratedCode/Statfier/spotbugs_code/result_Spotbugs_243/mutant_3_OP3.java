import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.Serializable;

class BadReadResolve implements Serializable {

  private static final long serialVersionUID = 1L;

  @ExpectWarning("Se")
  public BadReadResolve readResolve() {
    boolean condition = getCondition();
    if (condition) {
      // This block is intended to be unreachable
      System.out.println("This should never be printed");
    }
    return new BadReadResolve();
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }
}