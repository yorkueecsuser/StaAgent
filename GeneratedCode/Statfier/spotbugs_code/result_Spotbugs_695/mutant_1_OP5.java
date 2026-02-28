import edu.umd.cs.findbugs.annotations.ExpectWarning;
import net.jcip.annotations.GuardedBy;

class TestGuardedBy {
  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @GuardedBy("this")
  int x;

  int y;

  int z;

  public void setX(int v) {
    x = v;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        x = v * 2;
        break;
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
    return y + z;
  }

  private boolean getCondition() {
    return false;
  }
}