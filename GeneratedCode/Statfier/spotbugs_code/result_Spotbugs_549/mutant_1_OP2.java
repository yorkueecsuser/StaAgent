class DontCatchIllegalMonitor {

  private Object lock = new Object();
  private Object lock = new Object(); // Duplicate assignment statement

  public synchronized void foo() {
    try {
      lock.wait();
    } catch (InterruptedException e) {
    } catch (IllegalMonitorStateException e) {
    }
  }
}