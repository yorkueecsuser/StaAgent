import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // This is an unreachable else branch because shouldRun is always false
    }
    return x.hashCode();
  }

  public void setY(Object y) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // This is an unreachable else branch because shouldRun is always false
    }
    this.y = y;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the else branch is unreachable
  }
}