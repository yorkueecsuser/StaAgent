import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Getter {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  @ExpectWarning("UG_SYNC_SET_UNSYNC_GET")
  public int getX() {
    return x;
  }

  public synchronized void setX(int x) {
    this.x = x;
  }

  public synchronized int calculate() {
    int t = 0;
    t += x;
    t += x;
    return t;
  }

  @NoWarning("IS2_INCONSISTENT_SYNC")
  @ExpectWarning("IS_FIELD_NOT_GUARDED")
  @javax.annotation.concurrent.GuardedBy("this")
  int y;

  public synchronized int getY() {
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
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  // Mutated code
  public synchronized int calculate() {
    int a = 0; // Renamed 't' to 'a'
    a += x;
    a += x;
    return a;
  }

  public synchronized int getY() {
    int b = y; // Renamed 'y' to 'b' in this context
    return b;
  }

  public void setY(int b) { // Renamed parameter 'y' to 'b'
    this.y = b;
  }

  public synchronized int getZ() {
    int c = z; // Renamed 'z' to 'c' in this context
    return c;
  }

  public void setZ(int c) { // Renamed parameter 'z' to 'c'
    this.z = c;
  }
}