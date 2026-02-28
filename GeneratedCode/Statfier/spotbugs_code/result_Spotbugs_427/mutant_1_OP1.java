import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
    // Dead store mutation
    String qazwsxed = "unusedVariable";
  }

  public synchronized void incrementX() {
    x++;
  }
}