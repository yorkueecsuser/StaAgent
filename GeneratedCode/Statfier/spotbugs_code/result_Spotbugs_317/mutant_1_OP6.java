class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      // Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor will be false
      }
      
      this.wait();
    }
  }

  // Method to provide a dynamic condition that will be false
  private boolean getCondition() {
    return false;
  }
}