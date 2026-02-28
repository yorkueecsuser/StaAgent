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
    x = v; // Mutant: Duplicate assignment of x
  }

  public void setY(int v) {
    y = v;
    y = v; // Mutant: Duplicate assignment of y
  }

  public synchronized void setZ(int v) {
    z = v;
    z = v; // Mutant: Duplicate assignment of z
  }

  public int getXY() {
    return x + y;
  }

  public synchronized int getYZ() {
    return y + z;
  }
}