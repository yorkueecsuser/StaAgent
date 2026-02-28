import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    synchronized (this) {
      notify();
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be executed because condition is not set to true anywhere
        System.out.println("This is an unreachable case");
        break;
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be executed because condition is not set to true anywhere
        System.out.println("This is an unreachable case");
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}