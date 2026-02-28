import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    return x.hashCode();
  }

  public void setY(Object y) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    this.y = y;
  }

  private boolean getCondition() {
    return false;
  }
}