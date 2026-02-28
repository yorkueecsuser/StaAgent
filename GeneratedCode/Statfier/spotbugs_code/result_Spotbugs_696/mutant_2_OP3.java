import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.concurrent.GuardedBy;

class TestGuardedBy2 {

  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @GuardedBy("this")
  int x;

  int y;

  int z;

  public void setX(int v) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 0;
    }
    x = v;
  }

  public void setY(int v) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      y = 0;
    }
    y = v;
  }

  public synchronized void setZ(int v) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      z = 0;
    }
    z = v;
  }

  public int getXY() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0;
    }
    return x + y;
  }

  public synchronized int getYZ() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0;
    }
    return y + z;
  }

  private boolean getCondition() {
    // This method should return false at runtime to ensure the if blocks are unreachable
    return false;
  }
}