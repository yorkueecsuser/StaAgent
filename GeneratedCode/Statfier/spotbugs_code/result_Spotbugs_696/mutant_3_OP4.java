import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.concurrent.GuardedBy;

class TestGuardedBy2 {

  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @GuardedBy("this")
  int x;

  int y;

  int z;

  public void setX(int v) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      return y + z + 1;
    } else {
      return y + z;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}