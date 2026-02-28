import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;
  boolean conditionWhile = false; // Non-final variable to avoid unreachable statement error

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    synchronized (this) {
      notify();
    }
    // Inserted unreachable while loop
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This is an unreachable loop");
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
    // Inserted unreachable while loop
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This is another unreachable loop");
    }
  }
}