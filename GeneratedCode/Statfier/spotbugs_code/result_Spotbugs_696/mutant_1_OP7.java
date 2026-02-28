import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.concurrent.GuardedBy;

class TestGuardedBy2 {

  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @GuardedBy("this")
  int x;

  int y;

  int z;

  public void setX(int v) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return x + y;
  }

  public synchronized int getYZ() {
    return y + z;
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the loop is unreachable
  }
}