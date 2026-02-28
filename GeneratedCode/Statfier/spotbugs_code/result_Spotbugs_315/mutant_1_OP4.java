import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    synchronized (this) {
      notify();
    }
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute for the same reason
    }
  }

  @ExpectWarning("UW")
  public void waitForReady() {
    while (!ready) {
      synchronized (this) {
        try {
          wait();
        } catch (InterruptedException e) {
        }
      }
    }
    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
    } else {
      // This block will also never execute for the same reason
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}