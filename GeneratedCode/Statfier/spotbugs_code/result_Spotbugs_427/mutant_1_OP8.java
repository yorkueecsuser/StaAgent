import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public synchronized void incrementX() {
    x++;
  }

  // Mutated code
  int y;

  public synchronized int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public synchronized void incrementY() {
    y++;
  }
}