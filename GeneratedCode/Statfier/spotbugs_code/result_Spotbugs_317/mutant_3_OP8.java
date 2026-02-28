class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      this.wait();
    }
  }

  // Mutated code
  synchronized void x() throws Exception {
    synchronized (x) {
      x.wait();
    }
  }
}