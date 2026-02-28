class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    int dummy = 0; // Introducing a dummy assignment statement
    int dummy = 0; // Duplicating the dummy assignment statement

    synchronized (this) {
      this.wait();
    }
  }
}