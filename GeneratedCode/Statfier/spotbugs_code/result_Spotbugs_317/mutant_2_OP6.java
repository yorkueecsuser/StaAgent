class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      this.wait();
      
      // Unreachable for loop inserted here
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getConditionForLoop() will always return false
      }
    }
  }

  // Method to provide a dynamic condition for the for loop
  private boolean getConditionForLoop() {
    return false;
  }
}