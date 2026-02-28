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
      // Some code that should never run
      x = v * 2;
    } else {
      x = v;
    }
  }

  public void setY(int v) {
    y = v;
  }

  public synchronized void setZ(int v) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Some code that should never run
      z = v * 2;
      conditionWhile = false; // Ensure the loop exits
    }
    z = v;
  }

  public int getXY() {
    return x + y;
  }

  public synchronized int getYZ() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Some code that should never run
      z = y + i;
      conditionFor = false; // Ensure the loop exits
    }
    return y + z;
  }

  private boolean getCondition() {
    return false; // This method returns false, ensuring the branches are unreachable
  }
}