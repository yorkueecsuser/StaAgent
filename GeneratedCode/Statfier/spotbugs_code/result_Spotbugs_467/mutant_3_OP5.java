import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Out;

class Bug1578441 {
  @In Object x;

  @Out Object y;

  @Override
  public int hashCode() {
    // Inserting an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case will execute
        System.out.println("Default case executed");
        break;
    }
    return x.hashCode();
  }

  private boolean getAlwaysFalse() {
    return false;
  }

  public void setY(Object y) {
    this.y = y;
  }
}