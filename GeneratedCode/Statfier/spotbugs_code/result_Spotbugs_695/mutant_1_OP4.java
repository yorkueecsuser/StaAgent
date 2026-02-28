import edu.umd.cs.findbugs.annotations.ExpectWarning;
import net.jcip.annotations.GuardedBy;

class TestGuardedBy {
  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @GuardedBy("this")
  int x;

  int y;

  int z;

  public void setX(int v) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = v;
    } else {
      // Unreachable else block
      x = v * 2;
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return y + z;
    } else {
      // Unreachable else block
      return y - z;
    }
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}