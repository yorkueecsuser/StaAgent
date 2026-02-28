class TwoLocksWhileWaitingFalsePositive {

  /** dumb, not an instance of holding two different locks while waiting */
  synchronized void clueless() throws Exception {
    synchronized (this) {
      // Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        // This block will never execute because condition is always false
        System.out.println("This is an unreachable block");
      } else {
        // Alternative block that also won't execute due to the same condition
        System.out.println("This is another unreachable block");
      }
      this.wait();
    }
  }

  // Method to return a condition that is always false
  private boolean getCondition() {
    return false;
  }
}