class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  /** dumb, not an instance of holding two different locks while waiting */ // Duplicated comment
  synchronized void clueless() throws Exception {
    synchronized (this) {
      this.wait();
    }
  }
}