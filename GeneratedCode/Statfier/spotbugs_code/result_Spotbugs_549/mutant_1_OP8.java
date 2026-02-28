class DontCatchIllegalMonitor {

  private Object lock = new Object();

  public synchronized void foo() {
    try {
      lock.wait();
    } catch (InterruptedException e) {
    } catch (IllegalMonitorStateException e) {
    }
  }

  // Mutated code with renaming operator
  private Object x = new Object();

  public synchronized void bar() {
    try {
      x.wait();
    } catch (InterruptedException e) {
    } catch (IllegalMonitorStateException e) {
    }
  }
}