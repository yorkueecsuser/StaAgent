class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      this.wait();
      // Dead store mutation
      String jxvqtkfl = "unusedVariable";
    }
  }
}