import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    return x.hashCode();
  }

  public void setY(Object y) {
    this.y = y;
  }

  private boolean getCondition() {
    // This method returns false, making the loop condition always false
    return false;
  }
}