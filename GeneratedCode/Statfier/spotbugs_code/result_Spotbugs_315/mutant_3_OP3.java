import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;
  boolean condition = false; // Non-final variable to ensure dynamic determination

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    synchronized (this) {
      notify();
    }
    // Inserting unreachable if branch
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
    // Inserting unreachable if branch
    if (condition) {
      System.out.println("This is another unreachable statement.");
    }
  }
}