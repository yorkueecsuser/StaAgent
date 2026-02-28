class DontCatchIllegalMonitor {

  private Object lock = new Object();
  private Object lockDuplicate = new Object(); // Duplicate assignment

  public synchronized void foo() {
    try {
      lock.wait();
    } catch (InterruptedException e) {
    } catch (IllegalMonitorStateException e) {
    }
  }
}