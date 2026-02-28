import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    ready = true; // Mutant: duplicated assignment
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
  }
}