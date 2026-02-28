import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    synchronized (this) {
      notify();
    }
    // Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
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
    // Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, ensuring the if branch is unreachable
  }
}