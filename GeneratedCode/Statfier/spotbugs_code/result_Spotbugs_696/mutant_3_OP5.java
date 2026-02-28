import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.concurrent.GuardedBy;

class TestGuardedBy2 {

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
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
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
    // This method always returns false, making the switch case unreachable
    return false;
  }
}