import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement");
    }
    return x.hashCode();
  }

  public void setY(Object y) {
    this.y = y;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}