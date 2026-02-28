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
        System.out.println("This is an unreachable block in makeReady");
      } else {
        // Alternative code that also won't execute due to the same reason
        System.out.println("This is another unreachable block in makeReady");
      }
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
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // This block will never execute because getCondition() always returns false
          System.out.println("This is an unreachable block in waitForReady");
        } else {
          // Alternative code that also won't execute due to the same reason
          System.out.println("This is another unreachable block in waitForReady");
        }
      }
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}