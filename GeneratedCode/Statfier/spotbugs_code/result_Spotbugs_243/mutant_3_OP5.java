import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.Serializable;

class BadReadResolve implements Serializable {

  private static final long serialVersionUID = 1L;

  @ExpectWarning("Se")
  public BadReadResolve readResolve() {
    return new BadReadResolve();
  }

  // Introduced unreachable switch statement
  private boolean getUnreachableCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }
}