import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.Serializable;

class BadReadResolve implements Serializable {

  private static final long serialVersionUID = 1L;

  @ExpectWarning("Se")
  public BadReadResolve readResolve() {
    return new BadReadResolve();
    
    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}