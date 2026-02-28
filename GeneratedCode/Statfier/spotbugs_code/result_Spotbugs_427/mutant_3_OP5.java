import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        x = 100;
        break;
      default:
        // Default case
        break;
    }
    return x;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }

  public void setX(int x) {
    this.x = x;
  }

  public synchronized void incrementX() {
    x++;
  }
}