import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;

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
  }

  // Mutated code
  boolean x;

  @ExpectWarning("NN")
  public void makeX() {
    x = true;
    synchronized (this) {
      notify();
    }
  }

  @ExpectWarning("UW")
  public void waitforX() {
    while (!x) {
      synchronized (this) {
        try {
          wait();
        } catch (InterruptedException e) {
        }
      }
    }
  }
}