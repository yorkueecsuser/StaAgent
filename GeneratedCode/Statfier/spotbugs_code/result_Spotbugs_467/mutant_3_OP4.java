import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    // Introducing an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This is reachable code.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is unreachable code.");
    }
    return x.hashCode();
  }

  public void setY(Object y) {
    this.y = y;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the else block is unreachable
  }
}