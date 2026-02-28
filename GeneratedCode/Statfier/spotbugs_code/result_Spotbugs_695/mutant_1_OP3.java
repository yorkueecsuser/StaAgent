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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      y = v * 2;
    }
    y = v;
  }

  public synchronized void setZ(int v) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      z = v * 2;
    }
    z = v;
  }

  public int getXY() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return x * y;
    }
    return x + y;
  }

  public synchronized int getYZ() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return y * z;
    }
    return y + z;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if branches are unreachable
  }
}