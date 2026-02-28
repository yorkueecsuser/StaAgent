class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
        System.out.println("This is an unreachable loop");
      }
      this.wait();
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}