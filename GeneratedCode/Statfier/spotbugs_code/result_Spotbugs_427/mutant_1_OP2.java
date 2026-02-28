import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
    this.x = x; // Mutant: duplicated assignment
  }

  public synchronized void incrementX() {
    x++;
    x++; // Mutant: duplicated increment
  }
}