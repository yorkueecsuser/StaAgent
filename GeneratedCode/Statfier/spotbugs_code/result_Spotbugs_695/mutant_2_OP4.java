import edu.umd.cs.findbugs.annotations.ExpectWarning;
import net.jcip.annotations.GuardedBy;

class TestGuardedBy {
  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @GuardedBy("this")
  int x;

  int y;

  int z;

  public void setX(int v) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x = v * 2;
    } else {
      x = v;
    }
  }

  public void setY(int v) {
    y = v;
  }

  public synchronized void setZ(int v) {
    z = v;
  }

  public int getXY() {
    return x + y;
  }

  public synchronized int getYZ() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      return y + z + 1;
    } else {
      return y + z;
    }
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false; // This will always return false, but it's not a compile-time constant
  }
}