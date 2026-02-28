import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Getter {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  @ExpectWarning("UG_SYNC_SET_UNSYNC_GET")
  public int getX() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 42;
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      t = 0;
    }
    return t;
  }

  @NoWarning("IS2_INCONSISTENT_SYNC")
  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @javax.annotation.concurrent.GuardedBy("this")
  int y;

  public synchronized int getY() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      y = 42;
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      z = 42;
    }
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}