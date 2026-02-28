import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    synchronized (this) {
      notify();
      // Inserting unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block will never execute because getCondition() always returns false
      } else {
        // Alternative block that will also never execute
      }
    }
  }

  @ExpectWarning("UW")
  public void waitForReady() {
    while (!ready) {
      synchronized (this) {
        try {
          wait();
          // Inserting unreachable if-else statement
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // This block will never execute because getCondition() always returns false
          } else {
            // Alternative block that will also never execute
          }
        } catch (InterruptedException e) {
        }
      }
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}