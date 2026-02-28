class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      this.wait();
    }
  }

  /** mutant code with renaming mutation operator */
  synchronized void b() throws Exception {
    synchronized (a) {
      a.wait();
    }
  }
}