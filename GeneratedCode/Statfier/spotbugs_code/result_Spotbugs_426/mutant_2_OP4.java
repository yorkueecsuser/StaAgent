import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Getter {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  @ExpectWarning("UG_SYNC_SET_UNSYNC_GET")
  public int getX() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      int temp = x + 1;
    } else {
      // Another unreachable code
      int temp = x - 1;
    }
    return x;
  }

  public synchronized void setX(int x) {
    this.x = x;
  }

  public synchronized int calculate() {
    int t = 0;
    t += x;
    t += x;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      t = t * 2;
    } else {
      // Another unreachable code
      t = t / 2;
    }
    return t;
  }

  @NoWarning("IS2_INCONSISTENT_SYNC")
  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @javax.annotation.concurrent.GuardedBy("this")
  int y;

  public synchronized int getY() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      y = y + 1;
    } else {
      // Another unreachable code
      y = y - 1;
    }
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @NoWarning("IS2_INCONSISTENT_SYNC")
  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @net.jcip.annotations.GuardedBy("this")
  int z;

  public synchronized int getZ() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      z = z + 1;
    } else {
      // Another unreachable code
      z = z - 1;
    }
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if-else branches unreachable
  }
}