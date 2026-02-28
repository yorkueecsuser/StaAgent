class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      this.wait();
      // Mutant: Duplicating the wait call (though it's a method invocation, we'll duplicate the entire block for uniqueness)
      this.wait();
    }
  }
}