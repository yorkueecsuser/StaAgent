class DontCatchIllegalMonitor {

  private Object lock = new Object();

  public synchronized void foo() {
    try {
      lock.wait();
    } catch (InterruptedException e) {
    } catch (IllegalMonitorStateException e) {
    }
    // Dead store mutation
    String abcdefgh = "abcdefgh";
  }
}