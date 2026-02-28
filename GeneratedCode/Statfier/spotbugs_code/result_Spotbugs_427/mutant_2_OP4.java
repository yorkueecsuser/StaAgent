import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x = 0;
    } else {
      // Alternative unreachable code
      x = 1;
    }
    return x;
  }

  public void setX(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      this.x = 2;
    } else {
      // Alternative unreachable code
      this.x = 3;
    }
    this.x = x;
  }

  public synchronized void incrementX() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      x = 4;
    } else {
      // Alternative unreachable code
      x = 5;
    }
    x++;
  }

  private boolean getCondition() {
    // This method should return a condition that is dynamically determined at runtime
    return false; // This is just a placeholder; in a real scenario, this should be dynamic
  }
}