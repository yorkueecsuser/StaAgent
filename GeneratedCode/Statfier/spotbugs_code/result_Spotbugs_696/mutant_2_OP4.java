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
      x = v;
    } else {
      // Unreachable else branch
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      return x + y;
    } else {
      // Unreachable else branch
      return x - y;
    }
  }

  public synchronized int getYZ() {
    return y + z;
  }

  private boolean getCondition() {
    // This method can return true or false dynamically
    return false;
  }
}