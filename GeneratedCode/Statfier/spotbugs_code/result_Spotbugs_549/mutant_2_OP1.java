class DontCatchIllegalMonitor {

  private Object lock = new Object();

  public synchronized void foo() {
    try {
      lock.wait();
      // Mutant code inserted here
      String qvbnrhty = "unused";
    } catch (InterruptedException e) {
    } catch (IllegalMonitorStateException e) {
    }
  }
}