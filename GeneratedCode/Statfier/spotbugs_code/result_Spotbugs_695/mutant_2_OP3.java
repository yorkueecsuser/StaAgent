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
      // Unreachable code
      x = v * 2;
    }
    x = v;
  }

  public void setY(int v) {
    y = v;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      y = v * 2;
    }
  }

  public synchronized void setZ(int v) {
    z = v;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      z = v * 2;
    }
  }

  public int getXY() {
    return x + y;
  }

  public synchronized int getYZ() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return y + z + 1;
    }
    return y + z;
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}