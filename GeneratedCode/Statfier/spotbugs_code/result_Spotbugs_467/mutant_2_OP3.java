import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block");
    }
    return x.hashCode();
  }

  public void setY(Object y) {
    this.y = y;
  }

  private boolean getCondition() {
    // Always return false to ensure the if block is unreachable
    return false;
  }
}