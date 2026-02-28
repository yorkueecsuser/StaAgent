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
    x = v; // Mutant: duplicated assignment
  }

  public void setY(int v) {
    y = v;
    y = v; // Mutant: duplicated assignment
  }

  public synchronized void setZ(int v) {
    z = v;
    z = v; // Mutant: duplicated assignment
  }

  public int getXY() {
    return x + y;
  }

  public synchronized int getYZ() {
    return y + z;
  }
}