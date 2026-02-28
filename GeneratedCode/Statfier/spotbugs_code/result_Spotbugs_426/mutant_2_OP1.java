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
    // Dead Store Mutation
    int abcdefgh = 42; // Unused variable declaration
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
    // Dead Store Mutation
    String ijklmnop = "unused"; // Unused variable declaration
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
    // Dead Store Mutation
    double qrstuvwx = 3.14; // Unused variable declaration
  }
}