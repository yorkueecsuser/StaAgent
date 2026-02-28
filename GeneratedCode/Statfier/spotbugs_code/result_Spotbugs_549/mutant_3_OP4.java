class DontCatchIllegalMonitor {

  private Object lock = new Object();

  public synchronized void foo() {
    try {
      lock.wait();
    } catch (InterruptedException e) {
    } catch (IllegalMonitorStateException e) {
    }

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
    } else {
      // This block is unreachable because condition is always false
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}