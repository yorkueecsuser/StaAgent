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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  public void setY(int v) {
    y = v;
  }

  public synchronized void setZ(int v) {
    z = v;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  public int getXY() {
    return x + y;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  public synchronized int getYZ() {
    return y + z;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}