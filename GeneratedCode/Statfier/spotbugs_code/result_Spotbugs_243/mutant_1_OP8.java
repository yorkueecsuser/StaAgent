import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.Serializable;

class BadReadResolve implements Serializable {

  private static final long serialVersionUID = 1L;

  @ExpectWarning("Se")
  public BadReadResolve readResolve() {
    return new BadReadResolve();
  }

  // Mutant code
  private static final long q = 1L;

  @ExpectWarning("Se")
  public BadReadResolve a() {
    return new BadReadResolve();
  }
}