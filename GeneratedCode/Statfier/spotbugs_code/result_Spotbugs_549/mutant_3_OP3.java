class DontCatchIllegalMonitor {

  private Object lock = new Object();

  public synchronized void foo() {
    try {
      lock.wait();
    } catch (InterruptedException e) {
    } catch (IllegalMonitorStateException e) {
    }

    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}