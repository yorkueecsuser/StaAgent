import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = 0; // This line is unreachable because getCondition() will always return false
    }
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public synchronized void incrementX() {
    x++;
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = -1; // This line is unreachable because getCondition() will always return false
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if block unreachable
  }
}