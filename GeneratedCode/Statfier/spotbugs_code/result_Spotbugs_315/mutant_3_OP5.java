import edu.umd.cs.findbugs.annotations.ExpectWarning;

class NakedWait {
  boolean ready;

  @ExpectWarning("NN")
  public void makeReady() {
    ready = true;
    synchronized (this) {
      notify();
      // Introduced unreachable switch statement
      boolean alwaysFalse = getAlwaysFalse();
      switch (alwaysFalse) {
        case true:
          System.out.println("This is unreachable");
          break;
      }
    }
  }

  @ExpectWarning("UW")
  public void waitForReady() {
    while (!ready) {
      synchronized (this) {
        try {
          wait();
          // Introduced unreachable switch statement
          boolean alwaysFalse = getAlwaysFalse();
          switch (alwaysFalse) {
            case true:
              System.out.println("This is unreachable");
              break;
          }
        } catch (InterruptedException e) {
        }
      }
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}