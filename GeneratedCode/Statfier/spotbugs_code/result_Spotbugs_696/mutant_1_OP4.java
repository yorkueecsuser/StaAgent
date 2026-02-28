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
      // Some dummy code
      System.out.println("This is a reachable block");
    } else {
      // Unreachable block
      System.out.println("This is an unreachable block due to condition");
    }
    x = v;
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
    // This method always returns false, making the else block unreachable
    return false;
  }
}