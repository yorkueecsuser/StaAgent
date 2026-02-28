import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;
  boolean conditionWhile = false; // Non-final variable to make the while loop condition dynamic

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    synchronized (this) {
      notify();
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
    // Inserting unreachable while loop
    while (conditionWhile) { // This loop is unreachable because conditionWhile is false
      System.out.println("This is an unreachable loop");
    }
  }
}