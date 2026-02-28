import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getConditionForLoop() always returns false
    }
    return x.hashCode();
  }

  public void setY(Object y) {
    // Introduced an unreachable for loop according to the mutation operator
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getConditionForLoop() always returns false
    }
    this.y = y;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getConditionForLoop() {
    return false;
  }
}