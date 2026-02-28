class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      this.wait();
    }
  }

  /** mutant with renamed variable */
  synchronized void cluelessMutant() throws Exception {
    synchronized (x) {
      x.wait();
    }
  }
}